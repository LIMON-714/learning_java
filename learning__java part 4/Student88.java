/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java__part4_opp;

/**
 *
 * @author user
 */
public class Student88 {

    String name;
    int id;
    int age;
    static String uni = "yunnan university";

    Student88(String n, int i, int a) {
        name = n;
        age = a;
        id = i;
    }

    void displayinfo88() {
        System.out.println("");
        System.out.println("Student information !....");
        System.out.println("Student name : " + name);
        System.out.println("Student age : " + age);
        System.out.println("Student id : " + id);
        System.out.println("University : " + uni);

    }

}
