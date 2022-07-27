package com.company.inheritance;

public class Cow implements Animal{
    @Override
    public String walk() {
        return "Cow Walking on the road";
    }

    @Override
    public String eat() {
        return "Cow eat grass";
    }

    @Override
    public String voice() {
        return "Cow guuuuhn";
    }
}
