package com.company;

public class SumTwo {
    public SumTwo() {
    }

    public static void main(String[] args) {
        SumTwo CalObj = new SumTwo();
        CalObj.SumParam(10, -20);
        CalObj.SumParam(20.2D, 10.111D);
        CalObj.SumParam("Sum of ", "String");
        CalObj.SumParam(15000000000L, 15000000000L);
        CalObj.SumParamInt("10","20");
    }

    public void SumParam(int a, int b) {
        int ISum = a + b;
        System.out.println("Sum of Two Integer values with overloaded functions = " + ISum);
    }

    public void SumParam(double a, double b) {
        double FSum = a + b;
        System.out.println("Sum of Two Decimal values with overloaded functions = " + FSum);
    }

    public void SumParam(String a, String b) {
        String SSum = a.concat(b);
        System.out.println("Concatenation of two string values with overloaded functions = " + SSum);
    }

    public void SumParam(long a, long b) {
        long lSum = a + b;
        System.out.println("Sum of Two long values with overloaded functions = " + lSum);
    }
    public void SumParamInt(String a, String b) {
        String SSum = (a+b);
        System.out.println("Concatenation of two string values with overloaded functions = " + SSum);
    }
}
