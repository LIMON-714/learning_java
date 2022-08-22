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
public class Factorial_Class38 {

    public static void main(String[] args) {
        int i, n, mul;
        mul = 1;
        System.out.print("Enter the n value integer number  : ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        System.out.println("The factorial of "+n+" is : ");
        for (i = n; i >= 1; i--) {
            mul = mul * i;
            System.out.print(+i+"*");
        }
        
        System.out.println( "= "+mul);
    }
}
