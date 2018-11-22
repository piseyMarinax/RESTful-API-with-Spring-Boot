package ksm.restful.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ksm.restful.service.BikeServiceImpl;

@Configuration
public class WebConfiguration {

	@Bean
	BikeServiceImpl bikeServiceImpl() {
		return new BikeServiceImpl();
	}
}
