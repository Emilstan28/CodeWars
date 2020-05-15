package com.example.mypackage;

public class Diamond {
    public static String print(int n) {
        if (n % 2 == 0 || n < 0) {
            return null;
        }
        if (n == 1) {
            return "*\n";
        }

        int whiteSpaceCounter = n / 2;
        int smallerRows = n /2;
        String answer = "";
        for (int row = 0; row < smallerRows; row++) {
            for (int spaces = whiteSpaceCounter - row; spaces > 0; spaces--) {
                answer += " ";
            }
            for (int stars = 1 + (2 * row); stars > 0; stars --) {
                answer += "*";
            }
            answer += "\n";
        }
        for (int biggest = n; biggest > 0; biggest--) {
            answer += "*";
        }
        answer += "\n";
        for (int row = 1; row <= smallerRows; row++) {
            for (int spaces = row; spaces > 0; spaces--) {
                answer += " ";
            }
            for (int stars = n - (2 * row); stars > 0; stars --) {
                answer += "*";
            }
            answer += "\n";
        }
        return answer;
    }
}
