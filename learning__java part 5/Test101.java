package com.mycompany.java_part5.oop;

import java.util.Scanner;

public class Test101 {

    public static void main(String[] args) {
        System.out.print("Enter the n value here : ");
        Scanner x = new Scanner(System.in);
        int s = x.nextInt();

        FactirialUsingRecursion__class101 f1 = new FactirialUsingRecursion__class101();
        int result = f1.fact(s);
        System.out.println("The factiral of " + s + " is " + result);
    }
}
