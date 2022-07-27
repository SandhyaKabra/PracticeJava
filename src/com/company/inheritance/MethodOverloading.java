package com.company.inheritance;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.sum(1,2));
        System.out.println(mo.sum(1,2, 3));
        System.out.println(mo.sum("1","2"));
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    String sum(String a, String b) {
        return a + b;
    }
}
