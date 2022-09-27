package com.mycompany.java_part5.oop;

public class Teacher  {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void display() {
        System.out.println("The name is : " + getName());
        System.out.println("The age is : " + getAge());
    }

}
