package com.example.mypackage;

import java.util.Arrays;

public class FindUnique {
    public static double findUniq(double[] arr) {
        if (arr[0] != arr[1]) {
            if (arr[1] == arr[2]) {
                return arr[0];
            }
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }
}
