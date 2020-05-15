package com.example.mypackage;

public class MiddleLetter {
    public static String getMiddle(String word) {
        char[] getChars = word.toCharArray();
        String answer = "";
        if (getChars.length % 2 == 1) {
            return answer += getChars[(getChars.length / 2) + 1];
        }
        answer += getChars[getChars.length / 2];
        answer += getChars[(getChars.length / 2) + 1];

        return answer;

    }
}
