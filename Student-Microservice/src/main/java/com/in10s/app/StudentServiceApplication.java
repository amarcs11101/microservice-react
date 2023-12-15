package com.in10s.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.in10s.controller", "com.in10s.service"}) 
@EnableEurekaClient
public class StudentServiceApplication {
	
	@Value("${address.service.url}")
	private String addressServiceUrl;

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}
//	
//	@Bean
//	public WebClient webClient () {
//		WebClient webClient =WebClient.builder()
//				.baseUrl(addressServiceUrl).build();
//		
//		return webClient;
//	}

}
