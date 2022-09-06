package com.mycompany.java__part4_opp;

public class Argument__passingClass98 {

    public static void main(String[] args) {
        //Call By Reference using 
        CallByReference ob = new CallByReference();
        ob.name = "imtiaj";
        System.out.println("The calling name is : " + ob.name);

        ob.change(ob);
        System.out.println("The name is now :  " + ob.name);
    }
}
