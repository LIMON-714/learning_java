package com.mycompany.java__part4_opp;

public class Test__class81 {

    public static void main(String[] args) {
        Teacher teacher1, teacher2; // objict declare
        teacher1 = new Teacher(); // object create
        teacher2 = new Teacher(); // object create

        teacher1.name = "Limon Rahman";
        teacher1.gender = "male";
        teacher1.phone = 143647578;

        teacher2.name = "mumtahina chaiti";
        teacher2.gender = "female";
        teacher2.phone = 867423457;

        System.out.println("Name Is : " + teacher2.name);
        System.out.println("Gender Is : " + teacher2.gender);
        System.out.println("number  Is : " + teacher2.phone);
        System.out.println("");

        System.out.println("Name Is : " + teacher1.name);
        System.out.println("Gender Is : " + teacher1.gender);
        System.out.println("number  Is : " + teacher1.phone);

    }
}
