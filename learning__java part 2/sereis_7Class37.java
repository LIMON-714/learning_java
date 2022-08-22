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
public class sereis_7Class37 {

    public static void main(String[] args) {
        int i, n, mul;
        System.out.print("Enter the n value : ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();

        for (i = 1; i <= n; i++) {
            mul = 2 * i;
            System.out.println(i + "* 2 =" + mul);
        }
    }

}
