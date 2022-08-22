package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Sum_Ofdigit_Class44 {

    public static void main(String[] args) {
        int temp, num, r, sum = 0;
        System.out.print("enter your values : ");
        Scanner x = new Scanner(System.in);
        num = x.nextInt();
        System.out.println("The total  sumation of :" + num);

//        for (temp = num; temp != 0; temp = temp / 10) {
//            r = temp % 10;
//            sum = sum + r;
//
//        }
//
//        System.out.println("The Sum of digits is : " + sum);


        // for while loop 

        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;

        }

        System.out.println("The total sumation of : " + sum);

    }
}
