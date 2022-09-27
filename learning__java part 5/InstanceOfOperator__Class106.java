package com.mycompany.java_part5.oop;

public class InstanceOfOperator__Class106 {

    public static void main(String[] args) {
        Animal a = new Animal();
        master m = new master();
        dog d = new dog();

        System.out.println(d instanceof master);
        System.out.println(d instanceof Animal);
        System.out.println(m instanceof Animal);
        System.out.println(a instanceof master);
        System.out.println(m instanceof dog);
    }
}
