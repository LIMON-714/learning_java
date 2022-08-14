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
public class Unary_OperatorClass09 {

    public static void main(String[] args) {
        int x, result;
        System.out.print("Enter X value : ");
        Scanner a = new Scanner(System.in);
        x = a.nextInt();

        result = +x;
        System.out.println("the value is : " + result);

        result = -x;
        System.out.println("the value is : " + result);

        // prefix increment/ decrement
        result = ++x;
        System.out.println("the value is : " + result);

        result = --x;
        System.out.println("the value is : " + result);

        // postfix
        result = x++;
        System.out.println("the value is : " + result);

        result = x--;
        System.out.println("the value is : " + result);
        
       

    }

}
