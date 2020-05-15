package com.example.mypackage;

public class DrinkCola {
    public static String WhoIsNext(String[] names, int n){
        System.out.println("N: " + n + " names.length = " + names.length + "[n % names.length]: " + n % names.length);
        System.out.println("names[n % names.length]: " + names[n % names.length]);
        return names[(n % names.length) - 1];
    }
}
