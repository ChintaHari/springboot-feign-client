package com.example.springboot_feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringbootFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFeignClientApplication.class, args);
	}

}
