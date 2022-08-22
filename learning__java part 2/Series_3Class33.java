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
public class Series_3Class33 {

    public static void main(String[] args) {
        int i, n, mul,mul2;
        mul =1;mul2= 1;
        System.out.print("Enter any value:  ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        System.out.print("The i value is : ");
        for (i = 1; i <= n; i++) {
            mul = mul * i;
            System.out.print(i + ", ");
        }
        System.out.println("");
        System.out.println("The total multiplication is : " + mul);
        
        
        
        System.out.println("another is here\n");
        
        
      
        System.out.print("Enter any value:  ");
        Scanner z = new Scanner(System.in);
        n = z.nextInt();
        System.out.print("The i value is : ");
        for (i = 1; i <= n; i=i+2) {
            mul2 = mul2 * i;
            System.out.print(i + ", ");
        }
        System.out.println("");
        System.out.println("The total multiplication is : " + mul2);

        
        
        
        
        
        

    }

}
