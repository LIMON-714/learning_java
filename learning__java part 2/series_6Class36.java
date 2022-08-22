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
public class series_6Class36 {

    public static void main(String[] args) {

        int i, n,mul;
        mul = 1;
        
        System.out.print("Enter the n value: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (i = 1; i <= n; i = i + 2) {
            System.out.print(i + ", ");
            mul = mul * i;
        }
        System.out.println("");
        System.out.println("the total multiplication is : " + mul);

        
        
        System.out.println("\n");


        double j,m,mu;
        mu=1;
        
        
        System.out.print("Enter the m value: ");
        Scanner input1 = new Scanner(System.in);
        m = input1.nextDouble();
        for (j =1.5; j <= m; j = j +1.5 ) {
            System.out.print(j + ", ");
            mu=mu*j;
        }
        System.out.println("");
        System.out.println("the total multiplication is : " + mu);

    }
}
