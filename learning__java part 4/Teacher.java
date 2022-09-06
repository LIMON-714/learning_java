package com.mycompany.java__part4_opp;

public class Teacher {

    String name;
    String gender;
    int phone;
    int age;
    
 
    
    // call 
     void displayinfo(){
        
         System.out.println("Name Is : " +name);
        System.out.println("Gender Is : " +gender);
        System.out.println("number  Is : " +phone);
        System.out.println("\n");
    }
     
     
     //parametter
     void displayinfo2(){
         
         
          System.out.println("Name Is : " +name);
        System.out.println("Gender Is : " +gender);
        System.out.println("number  Is : " +phone);
        System.out.println("age  Is : " +age);
        System.out.println("\n");
         
         
         
         
     }
     
     void setinfo(String n ,String m , int i , int a ){
         name = n;
         phone = i ;
         gender = m;
         age = a;
         
     }

}
