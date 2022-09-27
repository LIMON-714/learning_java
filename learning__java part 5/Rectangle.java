
package com.mycompany.java_part5.oop;


public class Rectangle extends Shape {
    
    //area here
    
    double le, wi;
    
    Rectangle(double le, double wi){
        
        this.le= le;
        this.wi = wi;
    }
    
    @Override
    double area(){
        return le*wi;
    }
    
    
    
}
