package com.delivery.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class DeliveryDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryDetailsApplication.class, args);
	}

}
