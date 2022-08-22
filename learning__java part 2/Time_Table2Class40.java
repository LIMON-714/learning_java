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
public class Time_Table2Class40 {

    public static void main(String[] args) {
        int n, m;
        System.out.print("Enter the initital value of m : ");
        Scanner x = new Scanner(System.in);
        m = x.nextInt();

        System.out.print("Enter the final value of n : ");
        Scanner y = new Scanner(System.in);
        n = y.nextInt();
        
        System.out.println("The formula is : \n");

        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " =" + i * j);

            }
            System.out.println("\n\n");
        }

    }

}
