package com.example.mypackage;

public class CamelCase {
    public static String camelCase(String input) {
        int whiteSpaceNeeded = 0;
        int size = 0;

        for (char c : input.toCharArray()) {
            if (c == Character.toUpperCase(c))
                whiteSpaceNeeded++;
            size++;
        }

        char[] insertingSpaces = new char[size + whiteSpaceNeeded];

        for (int i = 0; i < input.toCharArray().length; i++) {
            insertingSpaces[i] = input.toCharArray()[i];
        }

        for (int i = 0; i < insertingSpaces.length; i++) {
            int edge = insertingSpaces.length -1;
            if (insertingSpaces[i] == Character.toUpperCase(insertingSpaces[i])) {
                while (edge > i) {
                    insertingSpaces[edge] = insertingSpaces[edge -1];
                    edge--;
                }
                insertingSpaces[i] = ' ';
                i++;
            }
        }

        String answer = new String(insertingSpaces);

      return answer;
    }
}
