package com.test.sAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	
	@After("execution(** com.test.bean.Employee.testMethod(..))")
	public void logBeforeV1()
	{
		System.out.println("\n\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Log Version 1");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n");
	}
}
