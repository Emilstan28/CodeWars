package com.example.mypackage;
import java.lang.Math;

public class PerfectSquare {
    public static long findNextSquare(long sq) {
        double square = sq;

        if (Math.sqrt(square) % 1 != 0) {
            return -1;
        } else {
            square = Math.sqrt(square);
            square++;
            sq = (long)Math.pow(square, 2);
            return sq;
        }
    }
}
