package com.mycompany.java_part5.oop;

public class polymorphisom__Class111 {

    public static void main(String[] args) {
        Shape s = new Shape();

        Shape s1 = new Rectangle(3.33, 20);
        System.out.println("The Ractangle : " + s1.area());

        Shape s2 = new Triangle(10, 20);
        System.out.println("the Triangle : " + s2.area());

    }
}
