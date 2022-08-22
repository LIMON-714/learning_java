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
public class Series_2Class32 {

    public static void main(String[] args) {
        int i, j, n, sum;
        sum = 0;
        System.out.print("Enter the n value : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (i = 1; i <= n; i = i + 2) {
            System.out.print(i + ", ");
            sum = sum + i;

        }
        System.out.println("");
        System.out.println("The total sumation is : " + sum);
    }

}
