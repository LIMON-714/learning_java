
package com.mycompany.java_part5.oop;


public class Triangle extends Shape {
    
    // area here
    double bass, hei;
    
    
    Triangle(double bass, double hei){
        this.bass= bass;
        this.hei= hei;
    }
    
    
    
    @Override
    double area(){
        return 0.5*bass*hei;
    }
    
    
}
