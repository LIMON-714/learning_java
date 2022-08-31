package javaclass_part3;

import java.util.Scanner;

public class Array_outClass59 {

    public static void main(String[] args) {
        int[][] A = new int[4][5];
        int k = 0;
        System.out.println("Enter 4 row  and 5 column values : ");
        
        System.out.println("A = ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = k;
                k++;

            }
        }

        // print 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + A[i][j]);

            }
            System.out.println("");
        }

    }
}
