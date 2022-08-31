package com.mycompany.learning__java;

public class String__class66 {

    public static void main(String[] args) {
        String s1 = "LImon rahman";
        String s2 = new String("limon rahman");

//   char[] s3 ={'L','I','M','O','N'};    
//   System.out.println(s3);
        System.out.println("The s1  is : " + s1);
        System.out.println("The s2  is : " + s2);

        int len = s1.length();

        System.out.println("The length of s1 is " + len);

        boolean x = s1.equals(s2);
        System.out.println("is s1 and s2 is same : " + x);
        
        boolean y = s1.equalsIgnoreCase(s2);
        System.out.println("is s1 and s2 is same : " + y);
        
        
        boolean m= s1.isEmpty();
        boolean mt= s1.contains("hn");
        
        
        
        
        

    }
}
