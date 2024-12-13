package com.predicciones.bayes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BayesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BayesApplication.class, args);
	}

}
