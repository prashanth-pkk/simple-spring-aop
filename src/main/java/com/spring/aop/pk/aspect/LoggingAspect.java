package com.spring.aop.pk.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;

@Aspect
public class LoggingAspect {

    // This advice runs before the method execution
    @Before("execution(* com.spring.aop.pk.service.BusinessService.*(..))")
    public void logBefore() {
        System.out.println("Logging before method execution...");
    }

    // This advice runs after the method execution
    @After("execution(* com.spring.aop.pk.service.BusinessService.*(..))")
    public void logAfter() {
        System.out.println("Logging after method execution...");
    }

    // This advice runs after method execution and if the method completes successfully
    @AfterReturning("execution(* com.spring.aop.pk.service.BusinessService.*(..))")
    public void logAfterReturning() {
        System.out.println("Logging after successful method execution...");
    }
}

