package com.springcloud.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceEndpointsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceEndpointsApplication.class, args);
	}

}
