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
public class Pattern_Class49 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter n value of line : ");
        Scanner x = new Scanner(System.in);  
        n = x.nextInt();
        System.out.println("The pattern if " +n+" is /");
        
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
