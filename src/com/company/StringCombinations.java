package com.company;

public class StringCombinations {

    public static void main(String[] args) {
        printAllCombinations("ABC", "");
    }

    public static void printAllCombinations(String s, String prefix){
        if(prefix.length() > s.length()){
            return;
        }
        System.out.println(prefix);
        for(int i=0; i< s.length(); i++){
            printAllCombinations(s, prefix + s.charAt(i));
        }
    }
}
