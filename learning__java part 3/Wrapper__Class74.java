package com.mycompany.learning__java;

public class Wrapper__Class74 {

    public static void main(String[] args) {
        // primitive 
        int x = 10;
        Integer y = Integer.valueOf(x);
        System.out.println("The Y value is : " + y);

        Integer z = x; // auto boxing
        System.out.println("The z value is : " + z);

//        againg objict to -- primitive
        double d =new Double (3.98);
        System.out.println("D is = "+d);
        
       double e = d;//unboxing
        System.out.println("the e = "+e);
       

    }
}
