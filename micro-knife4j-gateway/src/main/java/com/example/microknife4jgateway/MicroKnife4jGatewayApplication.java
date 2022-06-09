package com.example.microknife4jgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroKnife4jGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroKnife4jGatewayApplication.class, args);
    }

}
