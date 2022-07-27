package com.company.inheritance;

public class Cat extends AnimalAbstract{
    @Override
    public String walk() {
        return "Catwalk";
    }

    @Override
    public String eat() {
        return "Meow";
    }
}
