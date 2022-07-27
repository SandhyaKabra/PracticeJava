package com.company.inheritance;

public class MethodOverriding extends MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverriding();
        System.out.println(methodOverloading.sum(1,2));

        methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.sum(1,2));
    }

    int sum(int a, int b) {
        return a + b + 2;
    }
}