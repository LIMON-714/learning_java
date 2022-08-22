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
public class Ex_Class30 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("The sum Is :  " + sum);
        System.out.println(" ");

        int n, m, re;
        re = 0;
        System.out.print("Enter your frist number : ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();

        System.out.print("Enter your another number : ");
        Scanner y = new Scanner(System.in);
        m = y.nextInt();

        for (int i = n; i <= m; i++) {
            re = re + i;
            System.out.println("THe value of : " + i);
        }

        System.out.println("Total sum IS : " + re);
        
        System.out.println("other area");
        
        int r;
        r=0;
        for (int i = n; i <=m; i=i+2) {
            if(i%2==0){
                r=r+i;
            }
           
             System.out.println("The number is : "+i);
        }
        System.out.println("total sumation "+n+" to "+m+" is : "+r);

        
        
        
                int q=0;
        for (int i = n; i <=m; i=i+2) {
            if(i%2!=0){
                q=q+i;
            }
           
             System.out.println("The number is : "+i);
        }
        System.out.println("total sumation "+n+" to "+m+" is : "+q);


    }
}
