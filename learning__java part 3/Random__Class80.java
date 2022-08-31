package com.mycompany.learning__java;

import java.util.Random;
import java.util.Scanner;

public class Random__Class80 {

    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {
            Random rnd = new Random();

            int p = rnd.nextInt(4) + 1;

            int gussNumber;

            System.out.print("Enter your guss number here : ");
            Scanner x = new Scanner(System.in);
            gussNumber = x.nextInt();
            
            if( gussNumber== p){
                System.out.println("Congratulation won :"+p);
                
            }
            else{
                System.out.println("You loss the : "+p);
            }
        }

    }
}
