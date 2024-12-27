package com.spring.aop.pk.service;

public class BusinessService {
    public void addCustomer(String name) {
        System.out.println("Adding customer: " + name);
    }

    public void removeCustomer(String name) {
        System.out.println("Removing customer: " + name);
    }

    public void updateCustomer(String name) {
        System.out.println("Updating customer: " + name);
    }
}
