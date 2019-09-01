package tech.nikant.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currencyexchangeservice", url="localhost:8000")
//@FeignClient(name="currencyexchangeservice")
@FeignClient(name="netflixzuulapigatewayserver")
@RibbonClient(name="currencyexchangeservice")
public interface CurrencyExchangeServiceProxy {
	
	//@GetMapping("/currencyexchange/from/{from}/to/{to}")
	@GetMapping("/currencyexchangeservice/currencyexchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
