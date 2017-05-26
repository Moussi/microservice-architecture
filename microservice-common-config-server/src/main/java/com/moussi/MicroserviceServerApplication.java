package com.moussi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceServerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceServerApplication.class, args);
	}

	@Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroserviceServerApplication.class);
	}
}
