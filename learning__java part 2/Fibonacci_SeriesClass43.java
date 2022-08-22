package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Fibonacci_SeriesClass43 {

    public static void main(String[] args) {
        int n, frist = 0, sou = 1, fibo;
        System.out.print("How many fibonacci number you need : ");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        
        System.out.println("total fibonacci number is : ");

        System.out.print(frist + " " + sou);
        for (int i = 3; i <= n; i++) {
            fibo = frist + sou;
            System.out.print(" " + fibo);
            frist = sou;
            sou = fibo;

        }
    }
}
