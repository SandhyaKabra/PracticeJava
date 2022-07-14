package com.company;

/**
 * I = 1
 * II = 2
 * III = 3
 * IV = 4
 * V = 5
 * VI = 6
 * VII = 7
 * VIII = 8
 * IX = 9
 * X = 10
 */
public class RomanToInteger {

    public static void main(String args[]) {
        RomanToInteger Callobj = new RomanToInteger();
        Callobj.convertToInteger("IXIV");
    }

    public static void convertToInteger(String roman) {
        for (int i = 0; i <roman.length() ; i++) {
            if (roman.charAt(i) != roman.charAt(i+1))
            {
                
            }
        }
    }

    public static void totalsum(char s) {
        int value = 0, value1 = 0;
        if (s == 'I') {
            value = 1;
            System.out.println("I is " + value);
        }
        if (s == 'V') {
            value = 5;
            System.out.println("V is " + value);
        }
        if (s == 'X') {
            value = 10;
            System.out.println("X is " + value);
        }
        value1 = value1 + value;
    }
}



