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
public class Arithmetic_operatorClass06 {

    public static void main(String[] args) {
        int A;
        int B;
        System.out.print("Enter the values of A : ");
        Scanner a = new Scanner(System.in);
        A = a.nextInt();
        //System.out.println("The value of A is  : " + A);

        System.out.print("\nEnter the values of B : ");
        Scanner b = new Scanner(System.in);
        B = b.nextInt();
        //System.out.println("The value of B is  : " + B);

        int sum;
        sum = A + B;
        System.out.println("\nthe sum of A and B is : " + A + "+" + B + " =" + sum);

        int mul;
        mul = A * B;
        System.out.println("the multiplication is " + A + "*" + B + " =" + mul);

        double div;
        div = (double)A / B;
        System.out.println("the division of A and B is " + A + "/" + B + "=" + div);

        int sub;
        sub = A - B;
        System.out.println("the subtraction of A and B is " + A + "-" + B + "=" + sub);

        double rem;
        rem = (double)A % B;
        System.out.println("the reminder of A and B is " + A + "%" + B + "=" + rem);

    }

}
