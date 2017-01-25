package com.test.sAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {
	
	@Before("execution(* Employee.testMethod(..))")
	public void logBeforeV1(JoinPoint joinPoint)
	{
		System.out.println("\n\n^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Log Version 1");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n");
	}
}
