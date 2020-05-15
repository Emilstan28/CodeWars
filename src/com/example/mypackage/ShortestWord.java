package com.example.mypackage;

public class ShortestWord {
    public static int findShort(String s) {
        int check = 0;
        int length = 0;
        String[] findShort = s.split(" ");
        for (int i = 1; i< findShort.length; i++) {
            System.out.println("Original word: " + findShort[0]);
            if (findShort[i].length() < findShort[check].length()) {
                System.out.println("Found shorter i: " + findShort[i]);
                check = i;
                length = findShort[i].length();
            } else {
                length = findShort[check].length();
            }
        }
        return length;
    }
}
