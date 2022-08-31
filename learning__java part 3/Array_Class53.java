package javaclass_part3;

import java.util.Scanner;

public class Array_Class53 {

    public static void main(String[] args) {
        double sum = 0;
        int n;

        double[] number = new double[5];
        System.out.print("Please Enter your 5 number here :");
        Scanner x = new Scanner(System.in);

        n = number.length;

        for (int i = 0; i < n; i++) {
            number[i] = x.nextDouble();

        }
        for (int i = 0; i < n; i++) {
            sum = sum + number[i];

        }

        System.out.println("");
//        sum= number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("The total sumation of number is : " + sum);

        double avg;
        avg = sum / n;
        System.out.println("The total avarage number is : " + avg);
        System.out.println("");

        double max = number[0];
        for (int i = 1; i < n; i++) {
            if (max < number[i]) {
                max = number[i];

            }

        }

        System.out.println("The maximum number is : " + max);
        System.out.println("");

        double min = number[0];

        for (int i = 1; i < n; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("The minimum number is : " + min);

    }
}
