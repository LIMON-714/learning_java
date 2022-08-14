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
public class Switch_casaClass20 {

    public static void main(String[] args) {
        char ch;
        String n;
        System.out.print("Do you run the program here perss yes or no :  ");

        Scanner x = new Scanner(System.in);
        n = x.nextLine();
        if (n.equalsIgnoreCase("yes") || n.equalsIgnoreCase("YES")) {
            
            System.out.print("Enter a letter : ");
                    
            Scanner c = new Scanner(System.in);
            ch = c.next().charAt(0);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("This is a volwe : " + ch);
                    break;
                default:
                    System.out.println("This ta a consonent here : " + ch);
                    break;

            }

        } else {
            x.close();
        }

    }

}
