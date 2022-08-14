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
public class Capital_SmallClass17 {

    public static void main(String[] args) {
        char ch;
        System.out.print("Enter any letter as your like : ");
        Scanner x = new Scanner(System.in);
        ch = x.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("THe letter is small : " + ch);
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The letter is  capital : " + ch);
        } else {
            System.out.println("not a valid..!");
        }

    }

}
