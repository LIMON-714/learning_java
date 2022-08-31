/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass_part3;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class For_eachLoopClass54 {
    public static void main(String[] args) {
        String[] name ={"limon","chaiti","sonu","imti","momtahina"};
        int n = name.length;
        System.out.println(n);

//        for (int i = 0; i <n; i++) {
//            System.out.println(name[i]);
//        }



 for(String x :name){
     System.out.println(x);
 }
    }
}
