package com.example.mypackage;

public class DNA {
    public static String makeComplement(String dna) {
        char[] changeling = dna.toCharArray();

        for (int i =0; i < changeling.length; i++) {
            if (changeling[i] == 'A'){
                changeling[i] = 'T';
            }
            if (changeling[i] == 'T'){
                changeling[i] = 'A';
            }
            if (changeling[i] == 'C'){
                changeling[i] = 'G';
            }
            if (changeling[i] == 'G'){
                changeling[i] = 'C';
            }
        }
        String changed = new String(changeling);

        return changed;
    }
}
