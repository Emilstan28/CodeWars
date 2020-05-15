package com.example.mypackage;

import java.util.ArrayList;

public class Encoding {
    public String encode(String word){
        System.out.println(word);
        char[] verify = word.toCharArray();
        for (int i = 0; i < verify.length; i++) {
            if (verify[i] == '(')
                verify[i] = 'ą';
        }
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < verify.length; i++) {
            indexes.add(i);
            for (int j = i + 1; j < verify.length; j++) {
                System.out.println("Character.toLowerCase(verify[indexes.get(0)]) =" + Character.toLowerCase(verify[indexes.get(0)]) +
                        " Character.toLowerCase(verify[j]) = " + Character.toLowerCase(verify[j]));
                if (Character.toLowerCase(verify[indexes.get(0)]) == Character.toLowerCase(verify[j])) {
                    indexes.clear();
                    break;
                }
                System.out.println("======================================");
            } if (indexes.size() > 0) {
                for (int o = i - 1; o >= 0; o--) {
                    System.out.println("Character.toLowerCase(verify[indexes.get(0)]) =" + Character.toLowerCase(verify[indexes.get(0)]) +
                            " Character.toLowerCase(verify[o]) = " + Character.toLowerCase(verify[o]));
                    if (Character.toLowerCase(verify[indexes.get(0)]) == Character.toLowerCase(verify[o])) {
                        indexes.clear();
                        break;
                    }
                }
                System.out.println("======================================");
            }
            if (indexes.size() > 0) {
                System.out.println("Turning to (");
                System.out.println("======================================");
                verify[indexes.get(0)] = '(';
                indexes.clear();
            }
        }

        for (int i = 0; i < verify.length; i++) {
            if (verify[i] != '(')
                verify[i] = ')';
        }
        return new String(verify);
    }
}
