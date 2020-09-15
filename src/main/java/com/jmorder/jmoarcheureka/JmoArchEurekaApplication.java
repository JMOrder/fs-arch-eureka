package com.jmorder.jmoarcheureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JmoArchEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmoArchEurekaApplication.class, args);
	}

}
