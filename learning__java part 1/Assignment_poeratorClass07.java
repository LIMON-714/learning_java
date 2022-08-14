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
public class Assignment_poeratorClass07 { 
    public static void main(String[] args) {
        int x,y;
        System.out.print("Enter any X values : ");
        Scanner X =new Scanner(System.in);
        x= X.nextInt();
         
        System.out.print("Enter 2nd value : ");
        Scanner Y= new Scanner(System.in);
        y= Y.nextInt();
        
        
        x+=y;
        System.out.println("The value is : "+x);
        
        x-=y;
        System.out.println("The value is : "+x);
        
        x*=y;
        System.out.println("The value is : "+x);
        
        x/=y;
        System.out.println("The value is : "+x);
        
        x%=y;
        System.out.println("The value is : "+x);
        
        System.out.println("THANK YOU ..........");
          
    }
    
}
