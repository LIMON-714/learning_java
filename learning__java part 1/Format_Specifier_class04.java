/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic_java;

/**
 *
 * @author user
 */
public class Format_Specifier_class04 {

    public static void main(String[] arg) {

        char c = 'l';
        float f = 2.88f;
        boolean b = true;
        long l;
        double d = 23.4556;
        String ss;

        int i = 23;

        //formet specifier using %b and use printf
        System.out.printf("the boolean b = %b\n", b);
        System.out.printf("the double d = %.3f\n", d);
        System.out.printf("the character c = %c\n", c);
        System.out.printf("the integer i = %d\n", i);
        System.out.printf("the float f = %.2f\n", f);

    }

}
