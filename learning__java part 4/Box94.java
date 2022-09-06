
package com.mycompany.java__part4_opp;


public class Box94 {
    
    double height,width,depth;//instance variable
    
    //local variable
    Box94(double h,double w,double d){
        height=h;
        width = w;
        depth =d;
    }
    void displayVol(){
        double v =height*width*depth;
        System.out.println("The volume is : "+v);
    }
    
}
