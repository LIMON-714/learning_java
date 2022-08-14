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
public class Letter_GradeClass15 {

    public static void main(String[] args) {

        System.out.print("Do you Run the Letter garade : press \" yes\" or \"no\"  : ");
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if (n.equalsIgnoreCase("yes")) {

            double m;
            System.out.print("Enter your mark here : ");
            Scanner v = new Scanner(System.in);
            m = v.nextDouble();

            if (m >= 100 || m <= 0) {
                System.out.println("The mark is not a valid ! " + m);
            } else if (m <= 99 && m >= 80) {
                System.out.println("Congratulation !! You get A+ , your mark is : " + m);
            } else if (m <= 79 && m >= 70) {
                System.out.println("You get  A  mark is  : " + m);
            } else if (m <= 69 && m >= 60) {
                System.out.println("You get  A-  mark is  : " + m);
            } else if (m <= 59 && m >= 50) {
                System.out.println("You get  B  mark is  : " + m);
            } else if (m <= 49 && m >= 40) {
                System.out.println("You get  C  mark is  : " + m);
            } else if (m <= 39 && m >= 33) {
                System.out.println("You get  D not a good mark ,  mark is  : " + m);
            } else {
                System.out.println("You faild the exm try again later , your mark is  : " + m);
            }

        } else {
            sc.close();
        }

    }

}
