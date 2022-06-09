package com.example.microknife4jorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroKnife4jOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroKnife4jOrderApplication.class, args);
	}

}
