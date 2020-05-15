package com.example.mypackage;

public class SumOfBits {
    public static int countBits(int n){
        String bits = Integer.toBinaryString(n);
        int result = 0;
        for (char c: bits.toCharArray()) {
            result += Character.getNumericValue(c);
        }
        return result;
    }
}
