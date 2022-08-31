package com.mycompany.learning__java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime__Class78 {

    public static void main(String[] args) {
        // date here
        Date date = new Date();
//        System.out.println("to day is : " + date);
// format date 

        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");

        String crd = df.format(date);
        System.out.println("today is : " + crd);

    }
}
