package com.example.mypackage;

public class StringSplit {

    public static String abbrevName(String name) {
        name.toUpperCase();
        String[] names = name.split(" ");
        names[0].toUpperCase();
        names[1].toUpperCase();
        char[] nameOne = names[0].toCharArray();
        char[] nameTwo = names[1].toCharArray();


        return nameOne[0] + "." + nameTwo[0];
    }
}
