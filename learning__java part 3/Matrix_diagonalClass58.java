package javaclass_part3;

import java.util.Scanner;

public class Matrix_diagonalClass58 {

    public static void main(String[] args) {

        int[][] A = new int[3][3];

        int[][] B = new int[3][3];

        Scanner x = new Scanner(System.in);
        System.out.println("Please Enter your A enfer number : ");
       
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = x.nextInt();

            }
        }

        System.out.println("Please Enter your B enfer number : ");
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("B[%d][%d] = ", i, j);
                B[i][j] = x.nextInt();

            }
        }
       System.out.println("\n");

        // print matrix
        System.out.print("A = ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" \t" + A[i][j]);

            }
            System.out.println("");
        }

        System.out.println("\n");

        // print matrix
        System.out.print("B = ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + B[i][j]);

            }
            System.out.println(" ");
        }
        
        int sumOfdi=0,sumUpper=0, sumLow=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if(i==j){
                    sumOfdi= sumOfdi+A[i][j];
                    
                }
                if(i<j){
                    sumUpper= sumUpper+A[i][j];
                }
                if(i>j){
                    sumLow = sumLow+A[i][j];
                }
            }
            
        }

        System.out.println("\n");
        System.out.println("for A matris =");
        System.out.println("Sum of diagonal Elements = "+sumOfdi);
        System.out.println("Sum of upprr  Elements = "+sumUpper);
        System.out.println("Sum of lower Elements = "+sumLow);
    }
}
