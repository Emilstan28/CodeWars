package com.example.mypackage;

public class Frequency {
    public static int[] paintLetterboxes(final int start, final int end) {
        int[] answer = new int[10];

        for (int i = start; i <= end; i++) {
            int temp = i;
            while (temp > 0) {
                answer[temp % 10]++;
                temp /= 10;
            }
        }
        return answer;
    }
}
