package com.mycompany.java__part4_opp;

public class Teacher5 {

    String name, gender;
    int phone, age, no;

    Teacher5() {
        System.out.println("NO In ! action");
        System.out.println("");
    }

    Teacher5(String n, String m, int p, int a, int s) {
        name = n;
        gender = m;
        phone = p;
        age = a;
        no = s;
        

    }

    Teacher5(String n, String m, int a, int s) {
         name = n;
        gender = m;
        age = a;
        no = s;

    }

    Teacher5(String n,String m, int p) {
         name = n;
        gender = m;
        phone = p;
       
        

    }
    void displayinfo(){
        System.out.println("The Teachse Information here ! ....");
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("Phone : "+phone);
        System.out.println("Serial number : "+no);
        System.out.println("\n");
    }
}
