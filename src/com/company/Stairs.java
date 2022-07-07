package com.company;

public class Stairs {

    static int totalStep = 4;
    public static void main(String[] args) {
        System.out.println(stairs(0));
    }

    public static int stairs(int n){
        if(n > totalStep){
            return 0;
        }
        if(n == totalStep){
            return 1;
        }
        return stairs(n+1) + stairs(n+2);
    }
}
