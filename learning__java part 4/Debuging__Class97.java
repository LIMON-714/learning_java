package com.mycompany.java__part4_opp;

import java.util.Scanner;

public class Debuging__Class97 {

    public static void main(String[] args) {
        int p, q, sum = 0;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter your 1St integer value : ");
        p = x.nextInt();
        System.out.println("");
        System.out.print("Enter your last integer value : ");
        q = x.nextInt();

        for (int i = p; i <= q; i++) {
            sum = sum + i;
        }
        System.out.println("The total sumation is : "+sum);
    }
}
