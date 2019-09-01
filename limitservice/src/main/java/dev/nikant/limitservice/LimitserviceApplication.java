package dev.nikant.limitservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class LimitserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitserviceApplication.class, args);
	}

}
