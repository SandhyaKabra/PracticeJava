package com.company.inheritance;

public class InheritenceTest {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.eat());

        C c = new C();
        c.greetings();

    }
}

class A {
    public void greetings(){
        System.out.println("Hello from A");
    }
}

class B {
    public void greetings(){
        System.out.println("Hello from B");
    }
}

class C extends A {

}
