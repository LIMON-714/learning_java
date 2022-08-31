
package javaclass_part3;

import java.util.Arrays;


public class String_arrayClass61 {
    public static void main(String[] args) {
        int A[]= {10,20,34,23,23,24,35,46,34};
        
        Arrays.sort(A);
        
        //assending 
        for (int i = 0; i <A.length; i++) {
            System.out.print(" "+A[i]);
        }
        System.out.println("\n");
        //desinding 
        for (int i = A.length-1; i >= 0 ; i--) {
            System.out.print(" "+A[i]);
        }
        
        
        
        System.out.println("\n");
        
        String[]name= {"limon","chaiti","momtahina","rahman","imtiaj","ahmed"};
        
        Arrays.sort(name);
        
        System.out.println("Assending name values is : ");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        
        System.out.println("\n");
        
        System.out.println("The Desinding values : ");
        for (int i = name.length-1; i >= 0; i--) {
            System.out.println(name[i]);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
