package com.example.autores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AutoresRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoresRestApplication.class, args);
	}

}
