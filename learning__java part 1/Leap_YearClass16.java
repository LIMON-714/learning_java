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
public class Leap_YearClass16 {

    public static void main(String[] args) {
        String n;

        System.out.print("Do you run The program .. yes or no :");
        Scanner x = new Scanner(System.in);
        n = x.nextLine();

        if (n.equalsIgnoreCase("yes")) {

            int year;

            System.out.print("Enter your year : ");
            Scanner o = new Scanner(System.in);
            year = o.nextInt();

            if (year % 400 == 0) {
                System.out.println("The year is leap year  : " + year);
            } else if (year % 100 == 0) {
                System.out.println("The year is not leap year : " + year);
            } else if (year % 4 == 0) {
                System.out.println("The year is leap year  : " + year);
            } else {
                System.out.println("The year is not leap year  : " + year);
            }

        } else {
            x.close();
        }
    }
}
