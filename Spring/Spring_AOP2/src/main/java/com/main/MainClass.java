package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigureClass;
import com.entity.Login;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigureClass.class);
		Login l = context.getBean(Login.class);
		l.myLogin();
	}
}
