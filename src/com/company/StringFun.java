package com.company;

public class StringFun {
    public static void main(String args[]) {
        StringFun Callobj = new StringFun();
        Callobj.StringToInt("001");
        Callobj.IntToString(200, 002);
        Callobj.CharToInteger('5');
    }

    //String to Integer in Java
    public static void StringToInt(String val) {
        int finalval = Integer.parseInt(val);
        System.out.println("String is converted to integer as = " + finalval);
        System.out.println("Integer1 is added to another integer as = " + (finalval + 100));
        System.out.println("============");
    }

    //Integer to String in Java
    public static void IntToString(int x, int y) {
        String Str1 = Integer.toString(x);
        String Str2 = Integer.toString(y);
        System.out.println("Integer1 is converted to String as = " + Str1);
        System.out.println("Integer2 is converted to String as = " + Str2);
        System.out.println("String1 and String2 is concatenated as = " + Str1.concat(Str2));
        System.out.println("============");
    }

    //Char to Integer in Java
    public static void CharToInteger(char c) {
        int Str1 = Integer.parseInt(String.valueOf(c));
        System.out.println("Char is converted to Integer as = " + Str1);
        System.out.println("============");
    }
}
