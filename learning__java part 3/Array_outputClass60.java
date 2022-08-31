/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass_part3;

/**
 *
 * @author user
 */
public class Array_outputClass60 {
    public static void main(String[] args) {
        int A[][]=new int[4][];
        A[0]= new int[1];
        A[1]= new int[2];
        A[2]= new int[3];
        A[3]= new int[4];
        
        int k=0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <i+1; j++) {
                A[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" "+A[i][j]);
            }
            System.out.println("");
        }
    }
}
