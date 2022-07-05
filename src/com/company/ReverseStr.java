package com.company;

public class ReverseStr {
    public static void main(String[] args) {
        ReverseStr Callobj = new ReverseStr();
        Callobj.Sreverse("arbaK ayhdnaS");
    }

    public static void Sreverse(String s1) {
        StringBuffer valu = new StringBuffer(s1);
        System.out.println(valu.reverse());
    }
}

