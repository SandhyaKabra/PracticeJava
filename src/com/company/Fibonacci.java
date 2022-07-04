package com.company;

public class Fibonacci {
    public static void main(String args[]) {
        Fibonacci Callfib = new Fibonacci();
        Callfib.fibSeries(15);
    }

    //Fibonacci Series 0, 1, 1, 2, 3, 5, 8,13, 21, 34, 55, 89, 144, 233
    public static void fibSeries(int valu) {
        int a = 0, b = 1, c;
        System.out.print("A");
        System.out.print(" "+"B");
        System.out.println(" "+"Fibonacci");
        for (int i = 2; i < valu; i++) {
            System.out.print(a + " " + b+" ");
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }
    }
}
