/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic_java;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Max_minNumberClass14 {

    public static void main(String[] args) {
        int n, m, l;
        System.out.print("Enter your any real number : ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();

        System.out.print("\nEnter 2nd number as you like : ");
        Scanner y = new Scanner(System.in);
        m = y.nextInt();

        System.out.print("\nEnter another number as you like : ");
        Scanner z = new Scanner(System.in);
        l = z.nextInt();

        System.out.println("");

        if (m < n && l < n) {
            System.out.println("The maximum number is : " + n);

        } else if (n < m && l < m) {
            System.out.println("The maxinum numbart is : " + m);
        } else if (n < l && m < l) {
            System.out.println("The maximum number is : " + l);
        } else {
            System.out.println("Not a number ........");

        }

        if (m == l) {
            System.out.println("The common number is : " + l);
        } else if (n == l) {
            System.out.println("The common number is : " + n);
        } else if (n == m) {
            System.out.println("The common number is : " + n);
        } else {
            System.out.println("Thank you very much.................");
        }
    }

}
