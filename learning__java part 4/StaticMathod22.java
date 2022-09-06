
package com.mycompany.java__part4_opp;
 
public class StaticMathod22 {
    
    
    static int x = 10;
    void display(){
        // we can call Static Mathod here 
        
        display1();
        System.out.println("This is NonStaticMathod");
        
    }
    static void display1(){
        //cant clas nonstaticMthod here show error
        //display();
        System.out.println("This Is : "+x);
         System.out.println("This is Static Mathod here ! : ");
        
    }
}
