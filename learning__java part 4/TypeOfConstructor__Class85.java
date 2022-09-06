package com.mycompany.java__part4_opp;

public class TypeOfConstructor__Class85 {

    public static void main(String[] args) {
        
        //defoult constructor
        Teacher3 teacherx = new Teacher3();
        Teacher3 teachery = new Teacher3();
        Teacher3 teacherz = new Teacher3();

        teacherx.displayinfo3();
        teachery.displayinfo3();
        teacherz.displayinfo3();

        
        // parametterize constructor
        Teacher2 teacher1 = new Teacher2("Limon Rahman", "male", 234273353, 22);
        Teacher2 teacher2 = new Teacher2("imtiaj ahmed", "male", 353453344, 21);
        Teacher2 teacher3 = new Teacher2("Mumtahina chaiti", "female", 821186823, 18);

        teacher1.displayinfo2();
        teacher2.displayinfo2();
        teacher3.displayinfo2();
    }
}
