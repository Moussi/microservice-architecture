package com.moussi.microservicesentenceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceSentenceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSentenceClientApplication.class, args);
	}
}
