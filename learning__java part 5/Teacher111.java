
package com.mycompany.java_part5.oop;

public class Teacher111 extends parsons111 {
    
    // parsons111 is here 
    
    String uni;
    
    void uni(String u){
        
        u = uni;
    }
    
   
    @Override
    void display(){
        System.out.println();
        System.out.println("The name is : "+name);
        System.out.println("The name is : "+gender);
        System.out.println("The name is : "+age);
        System.out.println("The university name is : "+uni);
    }
}
