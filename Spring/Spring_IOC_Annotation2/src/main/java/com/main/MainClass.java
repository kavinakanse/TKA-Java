package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configure.ConfigureClass;
import com.entities.Car;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigureClass.class);
		Car c = context.getBean(Car.class);
		System.out.println(c);

	}

}
