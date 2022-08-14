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
public class Celsious_FahrenheitClass08 {

    public static void main(String[] args) {
        /**
        double C;
        System.out.print("Enter celsious value : ");
        Scanner X = new Scanner(System.in);
        C = X.nextDouble();

        double F;
        F = 1.8 * C + 32;
        System.out.println("The Fahrenheit tamparature is : " + F);
        
        */
        
        double F;
        System.out.print("Enter fahrenheit tamp : ");
        Scanner f =new Scanner(System.in);
        F=f.nextDouble();
        double C;
        C = (F-32)*0.55;
        
        System.out.println("The tamp "+F+"f is "+C+ "c");
        
        

    }
}
