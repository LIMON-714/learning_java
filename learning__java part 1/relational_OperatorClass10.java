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
public class relational_OperatorClass10 {

    public static void main(String[] args) {
        // <, >, <=,>=,==,!=

        int i, j;
        System.out.print("Enter frist value : ");
        Scanner x = new Scanner(System.in);
        i = x.nextInt();

        System.out.print("Enter anather value : ");
        Scanner Y = new Scanner(System.in);
        j = x.nextInt();

        if (i < j) {
            System.out.println("This is true ......");
        } else if (i > j) {
            System.out.println("This is flase .......");
        } else {
            System.out.println("not a number ........");
        }

    }

}
