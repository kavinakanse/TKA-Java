package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass {

//	@Before("execution (public void myLogin())")
//	public void beforeCalling() {
//		System.out.println("Firstly Register...");
//	}
//
//	@After("execution (public void myLogin())")
//	public void afterCalling() {
//		System.out.println("Welcome to home page...!");
//	}
	
	@Around("execution (* com.entity.Login.*())")
	public void aroundCalling(ProceedingJoinPoint p) throws Throwable {
		System.out.println("Firstly Register...");
		p.proceed();
		System.out.println("Welcome to home page...!");
	}
	
	
	
	
}
