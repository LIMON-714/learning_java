package com.mycompany.java_part5.oop;

public class Polymorphism__Class110 {

    public static void main(String[] args) {
        // dynamic binding > method overriding

        parsons111 p = new parsons111();
        p.name = "limon rahman";
        p.gender = " male";
        p.age = 21;
        p.display();

        p = new Teacher111();
        p.name = "Imtiaj ahmed";
        p.gender = " male";
        p.age = 21;
        p.display();

        Teacher111 x = new Teacher111();
        x.name = "chaiti";
        x.gender = "female";
        x.age = 19;
        x.uni = "dd university";
        x.display();

    }
}
