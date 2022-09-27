
package com.mycompany.java_part5.oop;

public class University {
    
    final String name = "Yunnan University";
    static final int fee ; //blank final vari 
    
    static{
        fee = 2200;
    }
    
//    
//    University(){
//        fee = 2300;
//    }    

    
    void display(){
        System.out.println("The University is : "+name);
        System.out.println("The tution feees is : "+fee);
    }
}
