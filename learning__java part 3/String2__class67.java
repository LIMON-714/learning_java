package com.mycompany.learning__java;

public class String2__class67 {

    public static void main(String[] args) {
        String fName = "LIMON ";
        String lName = "RAHMAN";

        String fUll = fName + lName;
        System.out.println("The name is : " + fUll);

        String x = fName.concat(lName);
        System.out.println("the name is :  " + x);

        System.out.println("");

        String upper = x.toUpperCase();
        String low = x.toLowerCase();
        System.out.println("Upprr case :: " + upper);

        boolean b = x.startsWith("L");
        boolean c = x.endsWith("o");
        System.out.println("is right : " + b);
        System.out.println("\n");

    }

}
