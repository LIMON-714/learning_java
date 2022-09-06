/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java__part4_opp;

/**
 *
 * @author user
 */
public class CallByReference {
    String name;
    void change(CallByReference s2){
        s2.name= "Limon";
    }
}
