package com.mycompany.learning__java;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Time_Class79 {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        System.out.println("now is : " + time);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh : mm : ss");

        String now = time.format(dtf);
        System.out.println("now time is : " + now);

    }
}
