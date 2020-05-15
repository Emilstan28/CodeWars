package com.example.mypackage;

public class NextBiggestNumber {
    public static long nextBiggerNumber(long n) {
        System.out.println("number at the start: " + n);
        String temp = Long.toString(n);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }

        long answer = 0;

        for (int o = newGuess.length - 1; o > -1; o--) {
            if (newGuess[o - 1] < newGuess[o]) {
                int temporary =  newGuess[o - 1];
                newGuess[o - 1] = newGuess[o];
                newGuess[o] = temporary;
                for (int guess : newGuess) {
                    answer *= 10;
                    answer += guess;
                }
                return answer;
            }
        }
        System.out.println("number at the end: " + answer);
        System.out.println("==============================================");
        return -1;
    }
}
