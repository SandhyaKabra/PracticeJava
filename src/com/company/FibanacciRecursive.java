package com.company;

/**
 * 0 1 1 2 3 5 8 13
 */
public class FibanacciRecursive {
    public static void main(String args[]) {
        FibanacciRecursive fibonacci = new FibanacciRecursive();
        fibonacci.printSeries(10);
    }

    public static void printSeries(int upto){
        for (int i = 0; i < upto; i++) {
            System.out.println(fib(i));
        }
    }
    public static int fib(int val) {
        if (val == 0) {
            return 0;
        }
        if (val == 1 || val == 2) {
            return 1;
        }
        return fib(val - 2) + fib(val - 1);
    }
}