package com.example.mypackage;


public class MexicanWave {
    public static String[] wave(String str) {
        char[] wave = str.toCharArray();
        if (wave.length == 0) {
            return new String[] {};
        }

        int charCounter = 0;

        for (char c : wave) {
            if (c != ' ')
                charCounter++;
        }

        String[] solution = new String[charCounter];

        charCounter = 0;

        String placement;

        for (int i = 0; i < wave.length; i++) {
            if (wave[i] == ' ') {
                charCounter++;
            } else {
                wave[i] = Character.toUpperCase(wave[i]);
                placement = new String(wave);
                solution[i - charCounter] = placement;
                wave[i] = Character.toLowerCase(wave[i]);
            }
        }
        return solution;
    }
}
