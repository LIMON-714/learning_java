/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass_part3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Array_class52 {

    public static void main(String[] args) {
        double sum = 0;
        int n;

        double[] number = new double[5];
        System.out.print("Please Enter your 5 number here :");
        Scanner x = new Scanner(System.in);

        n = number.length;

        for (int i = 0; i < n; i++) {
            number[i] = x.nextDouble();

        }
        for (int i = 0; i < n; i++) {
            sum = sum + number[i];

        }

        System.out.println("");
//        sum= number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("The total sumation of number is : " + sum);
        
        double avg;
        avg= sum/n;
        System.out.println("The total avarage number is : "+avg);
        
        
        
    }
}
