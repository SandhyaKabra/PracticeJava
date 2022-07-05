package com.company;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String args[]) {
        ReverseArray callobj = new ReverseArray();
        int[] array1 = new int[]{10, 20, 30, 40, 50, 60,-10};
        callobj.ReversearrayFun(array1);
// Alternate way to print complete array using foreach loop
        //Arrays.stream(array1).forEach(System.out::println);
        System.out.println("Reverse Array is displayed as ");
        for (int i = 0; i < array1.length ; i++) {
            System.out.println(array1[i]);
        }
    }

    public static void ReversearrayFun(int[] array1) {

//Alternate for same prroblem to implement using for loop
// for (int i = 0,j= array1.length-1; i<j; i++,j--) {
//            swap(array1, i, j);
//        }
        int i = 0;
        int j = array1.length - 1;
        while (i < j) {
            swap(array1, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] array2, int i, int j) {
        int swap = array2[i];
        array2[i] = array2[j];
        array2[j] = swap;
    }
}

