package com.mycompany.java__part4_opp;

import java.util.Scanner;

public class OverloadingConstructor2__class86 {

    public static void main(String[] args) {

        Teacher5 teacher1, teacher2, teacher3, teacher4;
        teacher1 = new Teacher5("Limon Rahman", "male", 22796858, 22, 121);
        teacher2 = new Teacher5("chaiti", "female", 577878768);
        teacher3 = new Teacher5();
        teacher4 = new Teacher5("imtiaj", "male", 22, 111);

        teacher1.displayinfo();
        teacher2.displayinfo();
        teacher3.displayinfo();
        teacher4.displayinfo();
    }
}
