/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class prime_Number_2Class42 {

    public static void main(String[] args) {
        int n, m, count = 0, nP = 0;
        System.out.print("Enter a value of n :");
        Scanner x = new Scanner(System.in);
        m = x.nextInt();
        System.out.print("Enter a value of m :");
        Scanner y = new Scanner(System.in);
        n = y.nextInt();

        for (int i = m; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("The valu is prime number : " + i);
                nP++;

            }
            count = 0;

        }
        System.out.println("");

        System.out.println("Total prime number is : " + nP);
    }

}
