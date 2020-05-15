package com.example.mypackage;

import java.util.ArrayList;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> strings = new ArrayList<>();
        for (String s : array1) {
            for (String string : array2) {
                for (int i = 0; i + s.length() < string.length(); i++) {
                    if (string.contains(s)) {
                        System.out.println("Substring found");
                        strings.add(s);
                        break;
                    }
                }
            }
        }
        for (String s : strings) {
            System.out.println("S: " + s);
        }
        return strings.stream().distinct().sorted().toArray(String[]::new);
    }
}
