package com.example.mypackage;

public class Outlier {
    static int find(int[] integers) {
        int indexOfOdd = 0;
        int numbersOfOdd = 0;
        int indexOfEven = 0;
        int numbersOfEven = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                indexOfEven = i;
                numbersOfEven++;
            } else {
                indexOfOdd = i;
                numbersOfOdd++;
            }
        }

        if (numbersOfEven > numbersOfOdd)
            return integers[indexOfOdd];
        else
            return integers[indexOfEven];
    }
}
