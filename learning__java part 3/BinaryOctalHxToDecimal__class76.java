package com.mycompany.learning__java;

public class BinaryOctalHxToDecimal__class76 {

    public static void main(String[] args) {
//        Binary Octal Hx To = Decimal
        String bin = "1010";
        Integer dec = Integer.parseInt(bin, 2);
        System.out.println("The decimal value is : " + dec);
        System.out.println("");

        String octal = "675";

        Integer des = Integer.parseInt(octal, 8);
        System.out.println("The octal value is : " + des);
        System.out.println("");
        
        
        String hx = "23A";
        Integer deci = Integer.parseInt(hx, 16);
        System.out.println("The Hxdecimal value is : " + deci);
        System.out.println("");

    }
}
