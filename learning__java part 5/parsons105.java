package com.mycompany.java_part5.oop;

public class parsons105 extends Teacher {

    private String quli;

    public String getQuli() {
        return quli;
    }

    public void setQuli(String quli) {
        this.quli = quli;
    }

    void display2() {
        System.out.println("");
        display();
        System.out.println("The Qualification  is : " + getQuli());
    }

}
