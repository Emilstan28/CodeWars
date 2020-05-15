package com.example.mypackage;

import java.util.ArrayList;

public class multiplesOfThreeAndFiveInANumber {
    public int solution(int number) {
        ArrayList<Integer> answer = new ArrayList<>();
        int countToFive = 1;
        for (int i = 3; i < number; i += 3) {
            if (countToFive == 5) {
                i += 3;
                countToFive = 1;
            }
            answer.add(i);
            countToFive++;
        }

        for (int i = 5; i < number; i += 5) {
            answer.add(i);
        }

        int solution = 0;

        for (int i : answer) {
            solution += i;
        }

        return solution;
    }
}
