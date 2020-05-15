package com.example.mypackage;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleLinear {
    public static int dblLinear (int n) {
        ArrayList<Integer> arrayOfResults = new ArrayList<>();
        ArrayList<Integer> arrayOfIntermediates = new ArrayList<>();
        ArrayList<Integer> arrayOfDoubleValues = new ArrayList<>();
        ArrayList<Integer> arrayOfTripleValues = new ArrayList<>();

        arrayOfResults.add(1);

        arrayOfIntermediates.add(1);

        do {
            for (int i : arrayOfIntermediates) {
                arrayOfDoubleValues.add((i * 2) + 1);
                arrayOfTripleValues.add((i * 3) + 1);
            }
            arrayOfIntermediates.clear();
            arrayOfIntermediates.addAll(arrayOfDoubleValues);
            arrayOfIntermediates.addAll(arrayOfTripleValues);
            arrayOfDoubleValues.clear();
            arrayOfTripleValues.clear();
            arrayOfResults.addAll(arrayOfIntermediates);
            Collections.sort(arrayOfResults);
            int counter = 0;
            for (int integ : arrayOfResults) {
                System.out.println(counter + ": ");
                System.out.print(integ + "\n");
                counter++;
            }
        } while (arrayOfResults.size() <= n);

        arrayOfDoubleValues.clear();
        arrayOfTripleValues.clear();

        int result = arrayOfResults.get(n + 1);
        System.out.println("arrayOfResults.get(n)" + arrayOfResults.get(n));
        System.out.println("arrayOfResults.get(n + 1)" + arrayOfResults.get(n + 1));
        System.out.println("arrayOfResults.get(n - 1)" + arrayOfResults.get(n - 1));


        arrayOfIntermediates.clear();
        arrayOfResults.clear();

        return result;
    }
}
