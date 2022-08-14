/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic_java;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Math_Class23 {
    public static void main(String[] args) {
        String y;
        int i,j;
        System.out.print("Do you run The program press yes or not : ");
        Scanner x= new Scanner(System.in);
        y= x.nextLine();
        
        if(y.equalsIgnoreCase("YES")|| y.equalsIgnoreCase("yes")){
            System.out.print("Ente frist value : ");
            Scanner  p = new Scanner(System.in);
            i= p.nextInt();
            System.out.print("Ente another value : ");
            Scanner  q = new Scanner(System.in);
            j= q.nextInt();
            
            int min = Math.min(i, j);
            System.out.println("THE minimum values is : "+min);
            
            int max = Math.max(i, j);
            System.out.println("THE maximum values is : "+max);
            
            int abs = Math.abs(j);
            System.out.println("THE ABS values is : "+abs);
            
            double pwr = Math.pow(i,j);
            System.out.println("the powwer of is : "+i+"^"+j+" = "+pwr);
            
            int rou = Math.round(8.8f);// if 8.4= 8 and 8.5 up = 9
            System.out.println("The round of 8.88 is : "+rou);
            
            System.out.println("The pi value is : "+Math.PI);
         
    }else{
            x.close();
        }
        
    }
}
