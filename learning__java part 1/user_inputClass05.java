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
public class user_inputClass05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner man = new Scanner(System.in);
        int number;
        double number2;
        String name;

        System.out.print("Enter frist integer number as you like...");

        number = input.nextInt();
        System.out.println("The frist int number is = " + number);

        System.out.print("\nEnter 2nd any number as you like...");
        number2 = num2.nextDouble();
        System.out.println("The another number is =" + number2);

        System.out.print("\nEnter your name here .... : ");
        name = man.nextLine();
        System.out.println("your name is  : "+name);

    }

}
