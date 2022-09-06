package com.mycompany.java__part4_opp;

public class StaticVariableTest__Class89 {

    public static void main(String[] args) {

        //nonstatic variable using
        Student89 s1 = new Student89();
        String obj = s1.uni;
        System.out.println("The university name is : " + obj);

        //and static variable
        System.out.println("");
        System.out.println("the collage: " + Student89.univ);
    }
}
