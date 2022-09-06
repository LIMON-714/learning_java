package com.mycompany.java__part4_opp;

import java.util.Scanner;

public class ReturningValue__class87 {

    public static void main(String[] args) {
        Returning87 obj1 = new Returning87();
        int i;
        System.out.print("Enter your valur : ");
        Scanner x = new Scanner(System.in);
        i = x.nextInt();

        int result = obj1.square(i);

        System.out.println("The square of "+i+" is  : " + result);
    }
}
