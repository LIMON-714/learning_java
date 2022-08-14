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
public class if_elseClass11 {

    public static void main(String[] args) {
        double x;
        System.out.print("Enter your number : ");
        Scanner X = new Scanner(System.in);
        x = X.nextDouble();

        if (x > 0) {
            System.out.println("The number is positive : " + x);
        } else if (x < 0) {
            System.out.println("The number is nagative  : " + x);
        } else {
            System.out.println("The number is zero : " + x);
        }

    }

}
