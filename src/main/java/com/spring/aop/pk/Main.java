package com.spring.aop.pk;

import com.spring.aop.pk.service.BusinessService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BusinessService bean
        BusinessService businessService = (BusinessService) context.getBean("businessService");

        // Call methods to see AOP in action
        businessService.addCustomer("John");
        businessService.removeCustomer("John");
        businessService.updateCustomer("Jane");
    }
}
