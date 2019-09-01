package dev.nikant.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import dev.nikant.limitservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
	
	@GetMapping("/faulttoleranceexample")
	@HystrixCommand(fallbackMethod = "fallbackretrieveConfiguration")
	public LimitConfiguration retrieveConfiguration() {
		throw new RuntimeException("Not available");
	}
	
	public LimitConfiguration fallbackretrieveConfiguration() {
		return new LimitConfiguration(999,9);
	}
}