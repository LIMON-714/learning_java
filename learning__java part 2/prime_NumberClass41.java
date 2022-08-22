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
public class prime_NumberClass41 {
    public static void main(String[] args) {
        int n,count=0;
        
        System.out.print("Enter any intger number : ");
        Scanner x= new Scanner(System.in);
        n = x.nextInt();
        for (int i = 2; i <n; i++) {
            if(n%i==0){
                count++;
                break;
                
            }
              
        }
        
        if(count==0){
            System.out.println("This is a prime number : "+n);
        }
        else{
            System.out.println("Not a prime number : "+n);
        }
    }
    
}
