package com.example.mypackage;

public class Persistent {
    public static int persistence(long n) {
        int counter = 0;
        if (n < 10)
            return 0;
        while (n >= 10) {
            long m = n % 10;
            n /= 10;
            while (n != 0){
                m *= n % 10;
                n /= 10;
            }
            counter++;
            n = m;
        }
        return counter;
    }
}
