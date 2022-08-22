/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class For_LoopClass24 {

    public static void main(String[] args) {
        int i;
        String y;
        System.out.print("Enter your name here : ");
        Scanner x = new Scanner(System.in);
        y = x.nextLine();

        for (i = 1; i <=10; i++) {
            System.out.println("The name is : " + i+"."+y);
        }
    }

}
