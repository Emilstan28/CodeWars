package com.example.mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Peaks {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        List<Integer> positions = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();

        for (int o = 0; o < arr.length; o++) {
            System.out.println("arr[" + o + "]: " + arr[o]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                positions.add(i);
                peaks.add(arr[i]);
            } else if (arr[i] == arr[i - 1] && arr[i] == arr[i + 1]) {
                if (i - 1 != 0 && i + 1 != arr.length - 1) {
                    if (arr[i - 1] > arr[i - 2] && (arr[i + 1] > arr[i + 2] || (arr[i + 1] == arr[i + 2] && i + 2 != arr.length - 1))) {
                        positions.add(i - 1);
                        peaks.add(arr[i - 1]);
                    }
                }
            } else if (arr[i] == arr[i - 1]) {
                if (i - 1 != 0) {
                    if (arr[i] > arr[i + 1] && arr[i - 1] > arr[i - 2]) {
                        positions.add(i - 1);
                        peaks.add(arr[i - 1]);
                    }
                }
            }

        }

        Map<String, List<Integer>> answers = new HashMap<>();
        answers.put("pos", positions);
        answers.put("peaks", peaks);

        return answers;
    }
}
