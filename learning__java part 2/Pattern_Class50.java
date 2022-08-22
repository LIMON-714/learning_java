package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Pattern_Class50 {

    public static void main(String[] args) {
        int n;
        System.out.print("Enter the line number :");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        System.out.println("The line pattern is /");
//        int i = n;
//        while (i >= 1) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//
//            }
//            i++;
//            System.out.println("");
//        }

        for (int i = n; i>=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
    }

}
