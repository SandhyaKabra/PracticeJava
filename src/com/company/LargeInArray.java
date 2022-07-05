package com.company;

import jdk.nashorn.internal.codegen.CompilerConstants;

public class LargeInArray {
    public static void main(String args[]) {
        LargeInArray Callobj = new LargeInArray();
        int[] a = new int[]{20, -30, 10, 20, 250, 130};
        Callobj.LargeInArrayFun(a);
    }

    public static void LargeInArrayFun(int[] valu) {
        for (int i = 0; i < valu.length; i++) {
            for (int j = 1; j < valu.length; j++) {
                if (valu[i] < valu[j]) {
                    int k;
                    k = valu[i];
                    valu[i] = valu[j];
                    valu[j] = k;
                }
            }
        }
        int i=0;
        System.out.println(valu[i]);
    }

}
