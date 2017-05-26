package com.moussi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceArticleClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceArticleClientApplication.class, args);
	}
}
