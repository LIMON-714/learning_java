package com.mycompany.learning__java;

import java.util.Scanner;

public class StringBuffer__PalindromeClass72 {

    public static void main(String[] args) {

        String p;
        System.out.print("Enter your value here !: ");
        Scanner y = new Scanner(System.in);
        p = y.nextLine();

        String s1 = new String(p);
        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();
        System.out.println("\n");
        if (s1.equals(s2)) {
            System.out.println("This is Palindrome value : " + s2);
        } else {
            System.out.println("Not Palindrome value : " + s2);
        }

    }
}
