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
public class Vowel_ConsonantClass13 {

    public static void main(String[] args) {

        String n;
        System.out.print("Do you run The program .. yes or no :");
        Scanner p = new Scanner(System.in);
        n = p.nextLine();

        if (n.equalsIgnoreCase("yes")) {
            char ch;

            System.out.print("Enter your any letter A tO Z : ");
            Scanner x = new Scanner(System.in);
            ch = x.next().charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The character is vowel  : " + ch);
            } else {
                System.out.println("The character is conconent :  " + ch);
            }

        } else {
            p.close();
        }

    }

}
