
package com.mycompany.java_part5.oop;


public class VariableLenthArg__Class100 {
    int sum=0 ;
   void add(int ... num){
       for (int i : num) {
           sum = sum +i;
       }
       System.out.println("The total is : "+ sum);
   }
   
       
}
