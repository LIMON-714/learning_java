package com.mycompany.learning__java;

public class ConversionBetweenString__class75 {

    public static void main(String[] args) {
        //convartion primitive to string data 
        int i = 45;
        String s1;
        s1 = Integer.toString(i);
        System.out.println("The String S1 is : " + s1);
        
        double d = 3.55;
        String s2 = Double.toString(d);
        System.out.println("The String of S2 is : "+s2);
        
        
        // capital Integer and Double is Wrapper Class
        
        
        //again
        boolean bn = true;
        String sb = Boolean.toString(bn);
        System.out.println("The String value is : "+bn);

        
        System.out.println("\n");
        
        
        // string to primitive
        String s = "32";
        int a = Integer.parseInt(s);
        System.out.println("the integer valu is : "+a);
        
        String sd = "3.55";
        double dd = Double.valueOf(sd);//valueOf or parseDouble
        System.out.println("The double value is : "+dd);
        
        
        
        
        
        
        
        
        
        
    }
}
