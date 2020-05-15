package com.example.mypackage;

import java.util.ArrayList;
import java.util.List;

public class PermutationsTwo {
    public static ArrayList<String> halfAnswer = new ArrayList<>();
    public static void heapPermutation(char[] a, int size, int n) {
        // if size becomes 1 then adds the obtained
        // permutation to the list if it isn't there already
        if (size == 1) {
            int duplicate = 0;
            for (String string : halfAnswer) {
                if (string.equals(new String(a)))
                    duplicate++;
            }
            if (duplicate == 0)
                System.out.println("Adding new permutation: " + new String(a));
                halfAnswer.add(new String(a));
        }

        for (int i=0; i<size; i++)
        {
            heapPermutation(a, size-1, n);

            // if size is odd, swap first and last
            // element
            char temp;
            if (size % 2 == 1)
            {
                temp = a[0];
                a[0] = a[size-1];
            }

            // If size is even, swap ith and last
            // element
            else
            {
                temp = a[i];
                a[i] = a[size-1];
            }
            a[size-1] = temp;
        }
    }
    public static String singlePermutations(String s) {
        char[] letters = s.toCharArray();

        heapPermutation(letters, letters.length, letters.length);


        List<String> answer = halfAnswer;
        String[] answerStrings = new String[answer.size()];
        int strNum = 0;
        for (String string : answer) {
            answerStrings[strNum] = string;
            strNum++;
        }
        String temp = "";
        for (int i = 0; i < answerStrings.length; i++)
        {
            for (int j = i + 1; j < answerStrings.length; j++) {
                if (answerStrings[i].compareTo(answerStrings[j])>0)
                {
                    temp = answerStrings[i];
                    answerStrings[i] = answerStrings[j];
                    answerStrings[j] = temp;
                }
            }
        }

        halfAnswer = new ArrayList<>();
        for (int i = 0; i < answerStrings.length; i++) {
            System.out.println("answerStrings[" + i + "]: " + answerStrings[i]);
        }
        System.out.println("answerStrings.length / 2: " + answerStrings.length / 2);
        System.out.println("answerStrings[((length / 2) - 1)] : " + answerStrings[((answerStrings.length / 2) - 1)]);

        String finalStr = answerStrings[answerStrings.length / 2];
        System.out.println(finalStr);

        return finalStr;
    }
}