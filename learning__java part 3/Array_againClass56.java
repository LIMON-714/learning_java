/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass_part3;

/**
 *
 * @author user
 */
public class Array_againClass56 {

    public static void main(String[] args) {
        int[] num = {1, 234, 34, 45, 45, 46,};
        int sum = 0;

        for (int x : num) {
            System.out.println(x);
            sum = sum + x;
        }
        System.out.println("Total sum is : " + sum);
    }

}
