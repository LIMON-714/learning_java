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
public class Conditional_Operatorlass21 {
    // tarnary operator

    public static void main(String[] args) {
        int x, y, t, large;

        System.out.print("Ente a value of x :");
        Scanner a = new Scanner(System.in);
        x = a.nextInt();

        System.out.print("Ente a value of y :");
        Scanner b = new Scanner(System.in);
        y = b.nextInt();
        System.out.print("Ente a value of y :");
        Scanner o = new Scanner(System.in);
        t = o.nextInt();

        large = x > y && x > t ? x : y > x && y > t ? y : t;
        System.out.println("The large number is : " + large);

    }

}
