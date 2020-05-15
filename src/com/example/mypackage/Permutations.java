package com.example.mypackage;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
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
    public static List<String> singlePermutations(String s) {
        char[] letters = s.toCharArray();

        heapPermutation(letters, letters.length, letters.length);


        List<String> answer = halfAnswer;
        halfAnswer = new ArrayList<>();

        for (String string : answer) {
            System.out.println("Permutation: " + string);
        }

        return answer;
    }
}
