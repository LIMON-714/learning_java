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
public class Odd_EvenClass12 {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);

        int x;
        System.out.print("Enter any int number as you like   :  ");

        x = X.nextInt();

        if (x % 2 == 0) {
            System.out.println("The number is Even " + x);
        }  else {
          System.out.println("The number is Odd  : " + x);
        }
    }
}
