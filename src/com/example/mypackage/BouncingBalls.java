package com.example.mypackage;

public class BouncingBalls {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce < 0 || bounce > 1 || window >= h)
            return -1;
        System.out.println("Window: " + window + " bounce: " + bounce);
        int result = 1;
        System.out.println("H: " + h);
        System.out.println("===================");
        while (window < h) {
            System.out.println("H: " + h);
            result += 2;
            h *= bounce;
        }
        System.out.println("===================");
        return result;
    }
}
