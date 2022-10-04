package com.example.ECommerceMicroservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ECommerceMicroservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceMicroservice2Application.class, args);
	}

}
