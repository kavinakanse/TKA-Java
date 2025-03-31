package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentWithHqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentWithHqlApplication.class, args);
		System.out.println("Application is started...");
	}

}
