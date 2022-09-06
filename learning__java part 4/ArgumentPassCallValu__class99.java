package com.mycompany.java__part4_opp;

public class ArgumentPassCallValu__class99 {

    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        int x = 2;
        System.out.println("The before value is : " + x);

        ob.change(x);
        System.out.println("The Now value is : " + x);
    }
}
