
package com.mycompany.java__part.six;


public class Triangle extends Shape {
    
    Triangle(double num1 , double num2){
       super(num1,num2);
    }
    
    void area(){
        double result = 0.5*num1 * num2;
        System.out.println("The Triangle area is : "+result);
    }
    
    
}
