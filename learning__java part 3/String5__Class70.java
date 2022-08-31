package com.mycompany.learning__java;

public class String5__Class70 {

    public static void main(String[] args) {
        String s1 = "This is my country here !";

        String r = s1.replace('i', 'I');
        System.out.println(r);

        String[] d = s1.split(" ");
        for (String x : d) {
            System.out.println(x);
        }

    }
}
