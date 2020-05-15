package com.example.mypackage;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        char[] stringCharArrOne = str1.toCharArray();
        char[] stringCharArrTwo = str2.toCharArray();

        for (int i = 0; i < stringCharArrOne.length; i++) {
            for (int o = 0; o< stringCharArrTwo.length; o++) {
                System.out.println("first of i: " + stringCharArrOne[i] + "second of o: " + stringCharArrTwo[o]);
                if (stringCharArrTwo[o] == stringCharArrOne[i]) {
                    stringCharArrTwo[o] = ' ';
                    break;
                }
                else if (o == stringCharArrTwo.length -1) {
                    return false;
                }
            }
        }
        return true;
    }
}
