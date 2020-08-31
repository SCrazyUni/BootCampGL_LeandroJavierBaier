package com.example.libros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients()
public class LibrosRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrosRestApplication.class, args);
	}

}
