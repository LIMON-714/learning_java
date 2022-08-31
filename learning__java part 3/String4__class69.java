package com.mycompany.learning__java;

public class String4__class69 {

    public static void main(String[] args) {
        String country = "bangladesh is my country";
        System.out.println(country);
        
        char ch = country.charAt(3);
        System.out.println("The char is of bangladesh Is : "+ch);
        
        int value = country.codePointAt(1);
        System.out.println("The value is a : "+value);
        
        
        int pos = country.indexOf("d");
        System.out.println("the index number of d is : "+pos );
        
        pos = country.lastIndexOf("n");
        System.out.println("the last index : "+pos);
        
    }
}
