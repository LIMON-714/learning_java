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
public class bitwise_operatorClass22 {

    public static void main(String[] args) {

        int i, j, s,sn,so,ls ,rs;
        System.out.print("Enter your value : ");
        Scanner x = new Scanner(System.in);
        i = x.nextInt();
        System.out.print("Enter your value : ");
        Scanner y = new Scanner(System.in);
        j = y.nextInt();

        s = i & j;
        sn= i^j;
        so = i|j;
        
        System.out.println(s);
        System.out.println(sn);
        System.out.println(so);
        
        
        ls=i>>j;
        rs= i<<j;
        
        System.out.println("The left shift : "+ls);
        System.out.println("The right shift : "+rs);
        

    }

}
