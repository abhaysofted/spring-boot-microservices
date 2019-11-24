package com.softed.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeConsumerApplication.class, args);
		System.out.println("EmployeeConsumerApplication started ............");
	}

}
