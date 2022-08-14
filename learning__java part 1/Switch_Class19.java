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
public class Switch_Class19 {

    public static void main(String[] args) {

        int ch, digit;
        System.out.print("Enter digit : ");
        Scanner x = new Scanner(System.in);
        ch = x.nextInt();

        switch (ch) {
            case 0:
                System.out.println("This is Zero : " + ch);
                break;

            case 1:
                System.out.println("This is one : " + ch);
                break;
            case 2:
                System.out.println("This is Two : " + ch);
                break;
            case 3:
                System.out.println("This is THERR : " + ch);
                break;
            case 4:
                System.out.println("This is FOUR : " + ch);
                break;
            case 5:
                System.out.println("This is FIVE : " + ch);
                break;
            case 6:
                System.out.println("This is SIX : " + ch);
                break;
            case 7:
                System.out.println("This is SEVEN : " + ch);
                break;
            case 8:
                System.out.println("This is EIGHT : " + ch);
                break;
            case 9:
                System.out.println("This is NINE : " + ch);
                break;

            default:
                System.out.println("not a digit .....!");
                break;
        }

    }
}
