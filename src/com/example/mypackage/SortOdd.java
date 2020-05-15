package com.example.mypackage;

import java.util.Arrays;

public class SortOdd {
    public static int[] sortArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] reference = Arrays.stream(array).filter(i -> i % 2 == 1).sorted().toArray();
        int lastIndexChanged = 0;
        for (int value : reference) {
            for (int j = lastIndexChanged; j < array.length; j++) {
                if (array[j] % 2 == 1) {
                    array[j] = value;
                    lastIndexChanged = j;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
        return array;
    }
}
