package com.example.mypackage;

public class DigitalRoot {
    public static int digital_root(int n) {
        int sumOfDigits = 0;
        while (true) {
            sumOfDigits += n % 10;
            n /= 10;
            if (n == 0 && sumOfDigits > 10) {
                n = sumOfDigits;
                sumOfDigits = 0;
            } else if (n == 0 && sumOfDigits < 10) {
                break;
            }
        }

        return sumOfDigits;
    }
}
