package javaclass_part3;

import java.util.Scanner;

public class For_eachExmplClass55 {

    public static void main(String[] args) {
        String[] name = new String[6];
        System.out.println("Plsase Enter your name here : ");

        Scanner v = new Scanner(System.in);
        name[0] = v.nextLine();
        name[1] = v.nextLine();
        name[2] = v.nextLine();
        name[3] = v.nextLine();
        name[4] = v.nextLine();
        name[5] = v.nextLine();

        int n = name.length;
//        for (int i = 0; i < n; i++) {
//            System.out.println(name[i]);
//        }
System.out.println("");

        for (String x : name) {
            System.out.println(x);
        }
    }
}
