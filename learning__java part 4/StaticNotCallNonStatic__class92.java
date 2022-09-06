package com.mycompany.java__part4_opp;

public class StaticNotCallNonStatic__class92 {

    public static void main(String[] args) {
        //nonstatic mathod
        StaticMathod22 obj = new StaticMathod22();
        obj.display();

        System.out.println("\n");
        
        
        //static mathod no need object
        StaticMathod22.display1();

    }
}
