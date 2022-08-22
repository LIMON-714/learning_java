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
public class Series_Class31 {

    public static void main(String[] args) {
        int i, j, n, sum;
        sum = 0;
        System.out.print("Enter your n value : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + i;

            System.out.print(i+", ");
        }
        System.out.println(" ");
        System.out.println("total sumation is : " + sum);
    }

}
