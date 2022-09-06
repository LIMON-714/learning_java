
package com.mycompany.java__part4_opp;


public class Test__class83 {
    public static void main(String[] args) {
        Teacher teacher1,teacher2,teacher3;
        
        teacher1 = new Teacher();
        teacher2 = new Teacher();
        teacher3 = new Teacher();
        
        teacher1.setinfo("Limon Rahman","male",234273353,22);
        teacher2.setinfo("mumtahina chaiti" , "female", 78453345,19);
        teacher3.setinfo("imtiaj ahmed", "male",353453344,21);
        
        teacher1.displayinfo2();
        teacher2.displayinfo2();
        teacher3.displayinfo2();
       
    }
}
