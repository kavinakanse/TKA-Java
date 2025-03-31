package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeWithHqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeWithHqlApplication.class, args);
		System.out.println("Application is started....");
	}

}
