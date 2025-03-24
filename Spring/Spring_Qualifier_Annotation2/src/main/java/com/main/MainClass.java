package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigureClass;
import com.entities.User;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigureClass.class);
		User u = context.getBean(User.class);
		System.out.println(u.getLp1().price());
		System.out.println(u.getLp2().price());
		System.out.println(u.getLp3().price());
		
	}
	
}
