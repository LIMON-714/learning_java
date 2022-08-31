/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass_part3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Array4__classSorting {

    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(13);
        number1.add(19);
        number1.add(43);
        number1.add(15);
        number1.add(12);
        System.out.println("The number1 is  : " + number1);
        Collections.sort(number1);
        System.out.println("After sort  number1 is  : " + number1);
        
        System.out.println("");
        
        Collections.sort(number1, Collections.reverseOrder());
        
        System.out.println("After sort reverse1 is  : " + number1);
        
        
        
        
        System.out.println("\n");
        
        
        number2.add(-14);
        number2.add(11);
        number2.add(79);
        number2.add(-34);
        number2.add(-9);
        System.out.println("The number2 : is : " + number2);
        Collections.sort(number2);
        System.out.println("After sort  number2 is  : " + number2);

    }

}
