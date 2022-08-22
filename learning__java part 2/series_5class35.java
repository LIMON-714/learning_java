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
public class series_5class35 {

    public static void main(String[] args) {
        int i, n, sum, mul;
        sum = 0;
        mul = 1;

        System.out.print("Enter Thre n value : ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print(i+", ");

            sum = sum + (i*i);
        }

        System.out.println("");
        System.out.println("The total sumation of that : " + sum);
    }

}
