package com.example.mypackage;

import java.lang.Math;
import java.util.ArrayList;

public class DigitPowers {
    public static long digPow(int n, int p) {
        ArrayList<Integer> digits = new ArrayList<>();
        int m = n;
        while (m > 0) {
            digits.add(m % 10);
            m /= 10;
        }
        long comparator = 1;
        for (int i = digits.size() - 1; i >= 0; i--) {
            comparator += (int)Math.pow(digits.get(i), p);
            p++;
        }
        comparator -= 1;
        long compare = n;
        int i = 1;
        while (compare < comparator) {
            i++;
            compare = n;
            compare *= i;
            System.out.println("Compare: " + compare + " comparator: " + comparator);
        }
        if (compare == comparator)
            return i;
        else
            return -1;
    }
}
