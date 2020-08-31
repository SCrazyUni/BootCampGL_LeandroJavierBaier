package com.example.generos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GenerosRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenerosRestApplication.class, args);
	}

}
