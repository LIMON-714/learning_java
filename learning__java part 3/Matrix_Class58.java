/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass_part3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Matrix_Class58 {

    public static void main(String[] args) {
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];

        System.out.println("Enter the  A matrix value : ");
        Scanner d = new Scanner(System.in);

//get inputA
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = d.nextInt();

            }
        }

//get inputB
        System.out.println("");

        System.out.println("Enter the B matrix value : ");
        Scanner f = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("B[%d][%d] = ", i, j);
                B[i][j] = d.nextInt();

            }
        }

        System.out.println("\n");

        // print matrix
        System.out.print("A = ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" \t" + A[i][j]);

            }
            System.out.println("");
        }

        System.out.println("\n");

        // print matrix
        System.out.print("B = ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + B[i][j]);

            }
            System.out.println(" ");
        }

        
        
        
        // add A nd B
        
        
        System.out.println("\n");
        System.out.print("A+B= ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
               int c= (A[i][j] + B[i][j]);
                System.out.print("  \t"+c);
            }
            System.out.println("");
        }
    }
}
