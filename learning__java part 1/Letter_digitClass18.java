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
public class Letter_digitClass18 {

    public static void main(String[] args) {
        String n;
        char ch;

        System.out.print("Enter any key as you like : ");

        Scanner c = new Scanner(System.in);
        n = c.nextLine();
        ch = n.charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("This is a letter here : " + ch);

        } else if (ch >= '0' && ch <= '9') {
            System.out.println("this is a digit here : " + ch);

        } else {
            System.out.println("This is spacial character : " + ch);

        }

    }
}
