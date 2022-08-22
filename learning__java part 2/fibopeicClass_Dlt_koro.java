package com.mycompany.mavenproject2;

import java.util.Scanner;

public class fibopeicClass_Dlt_koro {

    public static void main(String[] args) {

        int m, n, sum = 0, count = 0, np = 0;
        System.out.print("Enter the value of m :");
        Scanner x = new Scanner(System.in);
        m = x.nextInt();

        System.out.print("Enter the value of m :");
        Scanner y = new Scanner(System.in);
        n = y.nextInt();

        for (int i = m; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;

                }
            }
            if (count == 0) {
                System.out.println("The prine number is :" + i);
                np++;

            }
            count = 0;
        }

        System.out.println("");
        System.out.println("The total prime number is : " + np);
    }

}
