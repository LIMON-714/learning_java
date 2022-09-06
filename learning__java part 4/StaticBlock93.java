package com.mycompany.java__part4_opp;


public class StaticBlock93 {
    
    
    static int id;
    static String name;
    
    
    static{
        id = 123;
        name= "Limon Rahnam";
    }
    static void display(){
        System.out.println("");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
    }
}
