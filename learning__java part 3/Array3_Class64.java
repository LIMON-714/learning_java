/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass_part3;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Array3_Class64 {
    public static void main(String[] args) {
        ArrayList<Integer> number1= new ArrayList<>();
        ArrayList<Integer> number2= new ArrayList<>();
        ArrayList<Integer> number3= new ArrayList<>();
        
        
        number1.add(10);
        number1.add(30);
        number1.add(20);
        number1.add(50);
        number1.add(11);
        System.out.println("the num1 : "+number1);
        
        number2.add(60);
        number2.add(20);
        number2.add(55);
        number2.add(22);
        number2.add(16);
        System.out.println("the num2 is : "+number2);
        
        number3.addAll(number1);
        System.out.println("the number 3 is : "+number3);
        
        
        System.out.println("");
        
        boolean x = number1.equals(number3);
        boolean y = number1.equals(number2);
        System.out.println("is number 1 and 3 is same : "+x );
        System.out.println("is number 1 and 2 is same : "+y );
        
        
        
        
        
    }
    
}
