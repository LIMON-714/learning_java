package javaclass_part3;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2_Class63 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        System.out.println("The size of Array is : " + number.size());
        // add eliments

        number.add(10);
        number.add(20);
        number.add(70);
        number.add(50);
        number.add(30);
        number.add(60);

        number.add(6, 40);

//        System.out.println(number);
        // using foreach print value 
        System.out.print("[ ");
        for (int x : number) {
            System.out.print(" " + x);
        }
        System.out.print(" ]");

//             Iterator itr = number.iterator();
//             while(itr.hasNext()){
//                 System.out.print(" "+itr.next());
//                 
//             }
        System.out.println("");

        System.out.println("The size of Array is : " + number.size());

        System.out.println("\n");
        // removing elements 

        System.out.println("Update Number is : ");
        number.remove(1);

        System.out.println(number);
        System.out.println("The size of Array is : " + number.size());

        System.out.println("\n");

//        number.removeAll(number);
//        System.out.println(number);
//        System.out.println("The size of Array is : " + number.size());
        System.out.println("\n");
        boolean B = number.isEmpty();
        System.out.println(number);
        System.out.println("The Array is Empty : " + B);
        
        //chack 70 is here
           boolean x = number.contains(70);
        System.out.println("Is 70 is in the list : "+x);

        System.out.println("\n");

//        number.clear();
//        System.out.println(number);
//        System.out.println("The after clear size of Array is : " + number.size());
//
//        System.out.println("\n");
//        boolean v = number.isEmpty();
//        System.out.println(number);
//        System.out.println("The Array is Empty : " + v);
        

            number.set(4,88);
            System.out.println("the update is :"+number);
            
            
     

    }
}
