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
public class Series_4class34 {

    public static void main(String[] args) {
        double i, n, m, sum, mul;
        sum = 0;
        mul = 1;
        System.out.print("Enter the value of  n : ");
        Scanner x = new Scanner(System.in);
        n = x.nextDouble();

        for (i = 1.5; i <= n; i++) {
            System.out.print(i + ", ");
            sum = sum + i;
        }
        System.out.println("");
        System.out.println("The total sumation is : " + sum);

        System.out.println(" Another program here\n");

        mul = 1;
        System.out.print("Enter the value of  n : ");
        Scanner y = new Scanner(System.in);
        m = x.nextDouble();

        for (i = 1.5; i <= m; i++) {
            System.out.print(i + ", ");
            mul = mul * i;
        }
        System.out.println("");
        System.out.println("The total sumation is : " + mul);

    }

}
