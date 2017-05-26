package com.moussi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceVerbClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceVerbClientApplication.class, args);
	}
}
