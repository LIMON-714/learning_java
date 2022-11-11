package com.mycompany.java__part.six.List;

import java.util.LinkedList;

public class Linkedlist_CLass121 {

    public static void main(String[] args) {
        LinkedList<String> countryName = new LinkedList<String>();
        countryName.add("Bangladesh");
        countryName.add("China");
        countryName.add("Uk");
        countryName.add("Usa");
        countryName.add("Canada");
        countryName.add("Japan");
        countryName.addFirst("india");
        countryName.add(3, "argentina");
        countryName.remove(7);
        countryName.removeFirst();
        

        //System.out.println(countryName);
        for (String country : countryName) {
            System.out.println(country);
        }

        System.out.println("The size of countryName : " + countryName.size());

    }
}
