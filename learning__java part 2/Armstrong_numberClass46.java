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
public class Armstrong_numberClass46 {

    public static void main(String[] args) {
        int num, sum = 0, temp, r, tn;
        System.out.print("Enter your number : ");
        Scanner x = new Scanner(System.in);
        num = x.nextInt();
        System.out.println("the number of : "+num);
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            
            sum = sum + (r*r*r);
            
            temp = temp / 10;
        }
        System.out.println("total sumation is : "+sum);
        if(num==sum){
            System.out.println("this is an Armstrong number :"+sum);
        }else{
            System.out.println("Not an Armstrong number : "+sum);
        }
    }

}
