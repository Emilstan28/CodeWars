package com.example.mypackage;
import java.lang.Math;

public class Powers {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            for (int o = 0; o < b.length; o++) {
                if (b[o] == Math.pow(a[i], 2)){
                    break;
                }
                if (o == b.length -1)
                    return false;
            }
        }
        return true;
    }
}
