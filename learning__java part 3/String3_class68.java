package com.mycompany.learning__java;

public class String3_class68 {

    public static void main(String[] args) {
        String fName = "Limon";
        String lName = " Rahman";

        String p = fName.concat(lName);
        System.out.println("The name is : " + p);

        String y = fName + lName;
        System.out.println("again use + : " + y);

        boolean b = fName.equals(lName);
        System.out.println("Is two are same : " + b);

        String up = p.toUpperCase();
        String lw = p.toLowerCase();
        System.out.println("Uppercasr : " + up);
        System.out.println("Lowercasr : " + lw);

        System.out.println("\n");

        boolean d = fName.startsWith("b");
        System.out.println("is right to b : " + d);

        boolean f = lName.endsWith("n");
        System.out.println("Is last value is N : " + f);
        System.out.println("\n");

        String[] name = {"limon", "momtahina", "chaiti", "imti"};

//        System.out.println("The name is : " + name[3]);
//        System.out.println("The name is : " + name[2]);
        for (String x : name) {
            System.out.println(x);
        }

    }

}
