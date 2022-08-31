/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass_part3;

/**
 *
 * @author user
 */
public class Array_Class51 {
    public static void main(String[] args) {
        int[] number;
        number =new int[5];
        number[0]=12;
        number[1]=19;
        number[2]=11;
        number[3]=18;
        number[4]=13;
        int x = number.length;
        System.out.println("the lenth of array : "+x);
                System.out.println(number[4]);

        int sum= number[0]+number[1]+number[2]+number[3]+number[4];
        
        System.out.println("The total sumation is : "+sum);
    }
}
