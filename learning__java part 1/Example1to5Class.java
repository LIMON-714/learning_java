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
public class Example1to5Class {

    public static void main(String[] args) {
        double A;
                int H, B;
        System.out.print("Enter the frist vslue  :");
        Scanner h = new Scanner(System.in);
        H = h.nextInt();

        System.out.print("Enter the 2nd value :");
        Scanner b = new Scanner(System.in);
        B = h.nextInt();

        A = 0.5 * B * H;

        System.out.println("The area of triangle is : 1/2 *" + B + "*" + H + " =" + A);

        // again if lenth=H and width= B;
        int l, w;
        l = H;
        w = B;

        double area = l * w;

        System.out.println("The area of rectangle is : " + l + "*" + w + "= " + area);

        System.out.print("\n");
        // circle area calculate

        double x;
        int r;
        System.out.print("Enter the radius of circle : ");
        Scanner c = new Scanner(System.in);
        r = c.nextInt();

        x = 3.1516 * (r*r); // x= 2pyr
        System.out.println("The area of circle is A = 3.1516 * (" + r + "*" + r + ") = " + x);
        
        

    }

}
