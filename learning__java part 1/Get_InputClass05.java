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
public class Get_InputClass05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double d;
        float f;
        String s;
        char c;
        
        
        
        
        System.out.print("\nENTER ANY integer number   : ");
        number = input.nextInt();
        System.out.println("The integer number is = "+number);
        
        Scanner n= new Scanner(System.in);
        System.out.print("\nEnter any double value as you like ....: ");
        d = n.nextDouble();
        System.out.println("Your double number is =  "+d);
        
        Scanner m = new Scanner(System.in);
        System.out.print("\nEnter any float number as you like    : ");
        f = m.nextFloat();
        System.out.println("The float number is = "+f);
        
        Scanner name = new Scanner(System.in);
        System.out.print("\nEnter your full name here sir .... : ");
        s = name.nextLine();
        System.out.println("WELCOME Mr. "+s+" thank you for your present");
        
        Scanner ch = new Scanner(System.in);
        System.out.print("\nEnter any character as you like  : ");
        c = ch.next().charAt(0);
        System.out.println("The character  is  : "+c);
        
        System.out.println("..................Thank you very much............................");
        
        
        
        
        
    }
  
    
}
