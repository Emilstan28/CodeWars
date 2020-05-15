package com.example.mypackage;

public class PigLatinConverter {
    public static String pigIt(String str) {
        String[] arrOfStr = str.split(" !");
        for (int i = 0; i < arrOfStr.length; i++) {
            char[] stringChanging = arrOfStr[i].toCharArray();
            char temp = stringChanging[0];
            if (stringChanging.length - 2 >= 0)
                System.arraycopy(stringChanging, 1, stringChanging, 0, stringChanging.length - 1);
            stringChanging[stringChanging.length - 1] = temp;
            arrOfStr[i] = new String(stringChanging) + "ay";
        }
        String answer = "";
        for (int i = 0; i < arrOfStr.length; i++) {
            answer += arrOfStr[i];
            if (!(i == arrOfStr.length - 1)) {
                answer += " ";
            }
        }
        return answer;
    }
}
