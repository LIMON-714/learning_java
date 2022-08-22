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
public class Time_TableClass39 {

    public static void main(String[] args) {
        int n, m, i, mul, sum = 0;

        System.out.print("Enter the integer value of n : ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        System.out.println("The umber of  formula  " + n + " is : ");

        for (i = 1; i <= 10; i++) {
            mul = n * i;
            sum = mul + sum;
            System.out.println(n + " x " + i + " = " + mul);
        }
        System.out.println("");
        System.out.println("the total sumation is : " + sum);

        

    }

}
