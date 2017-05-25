package com.moussi.microservicesubjectclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceAdjectiveClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAdjectiveClientApplication.class, args);
	}
}
