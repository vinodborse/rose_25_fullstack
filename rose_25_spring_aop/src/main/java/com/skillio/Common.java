package com.skillio;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Common {

//	@Before("execution(public void emp*())")
//	public void data() {
//		System.out.println("---WELCOME---");		
//	}

//	@Before("execution(public void empSalary())")
//	public void data1() {
//		System.out.println("---WELCOME---");		
//	}
	
//	@After("execution(public void empData())")
//	public void bye() {
//		System.out.println("---END---");		
//	}
	
	@Around("execution(public void empData())")
	public void d1(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("---WELCOME---");
		pjp.proceed();
		System.out.println("----BYE----");

	}
}
