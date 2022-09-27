
package com.mycompany.java_part5.oop;

public class car extends Vehicle {
    
    // color 
    // weight 
    // attribute is here 
    
    int gear;
    
    car(String c,double w, int g){
        super(c,w);// calling the constructor of vahical class
        gear = g;  
    }
    
    @Override
    void attribute(){
          
        super.attribute();
        System.out.println("The gear is : "+gear);
        
    }
    
    
    
    
}
