/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author user
 */
public class For_loopClass25 {
    public static void main(String[] args) {
       
        int i,j;
       
// increasing triangle
        for (i=1; i<=5;i++){
            for( j =1; j<i;j++){
                System.out.print(j+"");
            }
            System.out.println(i);
        }
        System.out.println(" ");

         // decreasing triangle
        for(i=1;i<=5;i++){
            for(j=i;j<=5;j++){
                System.out.print("*");
        
            }
            System.out.println();
        }
        
        System.out.println(" ");
        int n=5;
        for(i=1;i<=n; i++){
            for(j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(j=1;j<i; j++){
                System.out.print("*");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    

        // dimond 
        
      System.out.println(" ");
        
        for(i=1;i<=n; i++){
            for(j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(j=1;j<i; j++){
                System.out.print("*");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n; i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=i;j<n; j++){
                System.out.print("*");
            }
            for(j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }





    }
            
}
