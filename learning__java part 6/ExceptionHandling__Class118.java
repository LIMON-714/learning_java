package com.mycompany.java__part.six;

public class ExceptionHandling__Class118 {

    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("the total is : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception : " + e);
        } finally {
            System.out.println("the End....");
        }
    }
}
