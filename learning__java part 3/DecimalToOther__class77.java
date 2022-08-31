package com.mycompany.learning__java;

import java.util.Scanner;

public class DecimalToOther__class77 {
    
    public static void main(String[] args) {
        //decimal to other convert system\
        int dec;
        System.out.print("Rnter any decimal number : ");
        Scanner x = new Scanner(System.in);
        dec = x.nextInt();
        
        String bi = Integer.toBinaryString(dec);
        System.out.println("The " + dec + " binary is : " + bi);
        
        String octal = Integer.toOctalString(dec);
        System.out.println("The " + dec + " octal is : " + octal);
        
        String hx = Integer.toHexString(dec);
        System.out.println("The " + dec + " Hxdecimal is : " + hx);
        
    }
}
