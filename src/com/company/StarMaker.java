package com.company;

/*
#
##
###
####
#####

#####
####
###
##
#

    #
   ##
  ###
 ####
#####

i=0;j=0;n=4; space=3  i+j < n-1
i=1;j=0;n=4; space=2
1 = 1+2 = #3, space 2
2 = 3+2 = 5, space =  1
   #
  ###
 #####
#######

 */
public class StarMaker {


    public static void main(String[] args) {
        StarMaker Obj = new StarMaker();
        Obj.starMakerf1(5);
        Obj.starMakerf2(5);
        Obj.starMakerf3(5);
        Obj.starMakerf4(7);
        Obj.starMakerf5(4);
    }

    public void starMakerf1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("============");
    }

    public void starMakerf2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("============");
    }


    public void starMakerf3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j + 1) < n) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println("============");
    }

    public void starMakerf4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > 1; j--) {
                if ((i + j + 1) > n) {
                    System.out.print(" ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
        System.out.println("============");
    }
    private void starMakerf5(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n * 2 - 1); j++) {
                if (i + j < n - 1) {
                    System.out.print(" ");
                } else if (j < n + i) {
                    System.out.print("#");
                }
            }
            System.out.println(" ");
        }
        System.out.println("============");
    }

}




