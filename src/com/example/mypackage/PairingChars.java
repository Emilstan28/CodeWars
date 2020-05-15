package com.example.mypackage;

public class PairingChars {
    public static String[] solution(String s) {

        char[] operator = new char[s.length() + s.length() % 2];
        int i = 0;
        for (char c : s.toCharArray()) {
            operator[i] = c;
            i++;
            if (i == s.toCharArray().length && s.length() % 2 == 1)
                operator[i] = '_';
        }

        String input = "";
        i = 0;
        int position = 0;
        String[] answer = new String[operator.length / 2];

        for (char c : operator) {
            input += c;
            i++;
            if (i == 2) {
                answer[position] = input;
                position ++;
                i = 0;
                input = "";
            }
        }

     return answer;
    }
}
