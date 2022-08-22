package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Reverse_NumberClass45 {

    public static void main(String[] args) {
        int n, sum = 0, num, temp, r;
        System.out.print("Enter the value As you like : ");
        Scanner x = new Scanner(System.in);
        num = x.nextInt();

        System.out.println("the number is :" + num);

        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;

            temp = temp / 10;

        }
        System.out.println("The total reverse number is : " + sum);
    }

}
