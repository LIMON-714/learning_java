package com.mycompany.java_part5.oop;

public class Encpsulation__Class102 {

    public static void main(String[] args) {
        parson p1 = new parson();
        p1.setName(" Limon");
        String l = p1.getName();

        System.out.println("The name is : " + l);

        p1.setAge(22);

        System.out.println("The age is : " + p1.getAge());
    }
}
