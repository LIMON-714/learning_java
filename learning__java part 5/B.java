
package com.mycompany.java_part5.oop;


public class B extends A {
    int x = 5;// powerfull With A class so That print x = 5 
    int h = 10;
    
    void display(){
        System.out.println("The x is : "+x);
        System.out.println("The y is : "+y);
        System.out.println("The h is : "+h);
        
        System.out.println("if we use super.x work A : "+super.x);
    }
}
