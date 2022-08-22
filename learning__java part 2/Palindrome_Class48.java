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
public class Palindrome_Class48 {

    public static void main(String[] args) {
        int num, sum = 0, temp, r;
        System.out.print("Enter the value : ");
        Scanner x = new Scanner(System.in);
        num = x.nextInt();

        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        System.out.println("The reverse number is : " + sum);
        System.out.println("");

        if (num == sum) {
            System.out.println("The number is palindrom number : " + num);

        } else {
            System.out.println("not palindronic number ...");
        }

    }

}
