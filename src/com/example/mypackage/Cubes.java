package com.example.mypackage;

public class Cubes {
    public static long findNb(long m) {
        long manipulating = m;
        int sumOfCubes = 0;
        int i = 1;
        while (true) {
            long cube = i*i*i;
            System.out.println("M: = " + m);
            System.out.println("I = " + i);
            System.out.println("I cubed = " + cube);
            if (cube < 0) {
                m -= -cube;
            } else {
                m -= cube;
            }
            sumOfCubes++;
            i++;
            if (m == 0)
                break;
            else if (m < 0)
                return -1;
        }
        return sumOfCubes;
    }
}
