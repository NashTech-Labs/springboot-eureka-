package com.knoldus.parentdemoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ParentDemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParentDemoServiceApplication.class, args);
	}

}
