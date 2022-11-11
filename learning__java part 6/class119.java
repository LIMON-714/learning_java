package com.mycompany.java__part.six;

import java.util.Scanner;

public class class119 {

    public static void main(String[] args) {

        while (true) {
            System.out.println();
            try {
                int u, y;
                Scanner x = new Scanner(System.in);
                System.out.print("Enter your 1st number : ");
                u = x.nextInt();
                System.out.print("Enter your 2nd number : ");
                y = x.nextInt();

                double result;
                result = (double) u / y;
                System.out.println("Result : " + u + "/" + y + " = " + result);

            } catch (Exception e) {
                System.out.println("Exception : " + e);
                System.out.println("you must enter an integer please try again ! ............");
            }

        }

    }
}
