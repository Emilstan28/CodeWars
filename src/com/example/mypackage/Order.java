package com.example.mypackage;

import java.util.stream.Stream;

public class Order {
    public  String order(String words) {
        System.out.println(words);
        if (words.equals(""))
            return "";
        String[] sentence = words.split(" ");
        String temp = "";
        for (int stringPosition = 0; stringPosition < sentence.length; stringPosition++) {
            for (int digitPosition = 0; digitPosition < sentence[stringPosition].length(); digitPosition++) {
                if (Character.isDigit(sentence[stringPosition].charAt(digitPosition))) {
                    if (Character.getNumericValue(sentence[stringPosition].charAt(digitPosition) - 1) > stringPosition) {
                        temp = sentence[Character.getNumericValue(sentence[stringPosition].charAt(digitPosition)) - 1];
                        System.out.println(Character.getNumericValue(sentence[stringPosition].charAt(digitPosition)));
                        sentence[Character.getNumericValue(sentence[stringPosition].charAt(digitPosition)) - 1] = sentence[stringPosition];
                        sentence[stringPosition] = temp;
                        temp = "";
                        stringPosition = -1;
                        break;
                    }
                }
            }
            for (String s : sentence) {
                System.out.println(s);
            }
            System.out.println("======================");
        }
        for (int i = 0; i < sentence.length; i++) {
            temp += sentence[i];
            if (i != sentence.length -1)
                temp += " ";
        }
        System.out.println(temp);
        return temp;
    }
}
