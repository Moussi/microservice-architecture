package com.moussi.microservice1server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Microservice1ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice1ServerApplication.class, args);
	}
}
