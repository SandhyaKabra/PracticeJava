package com.company;

//The number which is only divisible by 1 and itself is known as a prime number. For example 2, 3, 5, 7, 11… are prime numbers.
public class PrimeClass {
    public static void main(String args[]) {
        PrimeClass Callobj = new PrimeClass();
        for (int i = 1; i <= 11; i++) {
            boolean fvalue = Callobj.isPrimeNumber(i);
            if ( fvalue == true) {
                System.out.println(i + "= is Prime Number");
            }
        }
    }

    public static boolean isPrimeNumber(int val) {
        for (int i = 2; i < val; i++) {
            if ((val % i) == 0) {
                return false;
            }
        }
        return true;
    }
}