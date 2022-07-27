package com.company.inheritance;

public class Dog implements Animal{

    @Override
    public String walk() {
        return "Dog walk";
    }

    @Override
    public String eat() {
        return "Dog eat";
    }

    @Override
    public String voice() {
        return "Dog bark";
    }
}
