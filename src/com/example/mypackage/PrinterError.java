package com.example.mypackage;


public class PrinterError {
    public static String printerError(String s) {
        char[] errorChart = s.toCharArray();
        int totalLength = s.length();
        int counter = 0;

        for (int i = 0; i < totalLength; i++){
            if (errorChart[i] > 'm') {
                counter++;
            }
        }

        return counter + "/" + totalLength;
    }
}
