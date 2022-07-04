package com.company;

public class ArraySort {
    public ArraySort() {
    }

    public static void main(String[] args) {
        ArraySort calObje = new ArraySort();
        int[] a = new int[]{10,-30,10, 20, 50, 30};
        calObje.arraySwap(a);
        calObje.arrayPrint(a);
    }

    public void arraySwap(int[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i+1; j < a.length; j++) {
                if (a[i] >= a[j]) {
                    int storev = a[j];
                    a[j] = a[i];
                    a[i] = storev;
                }
            }
        }
    }

    public void arrayPrint(int[] a) {
        for(int k: a){
            System.out.println(k);
        }
    }
}

