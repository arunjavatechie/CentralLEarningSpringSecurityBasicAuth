package com.centrallearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.centrallearning")
public class CentralLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralLearningApplication.class, args);
	}
}
