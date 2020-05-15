package com.example.mypackage;

public class Factorials {
    public static String Factorial(int n) {
        System.out.println("Number to get: " + n);
        int check = 1;
        int second = 1;
        if (n == 1)
            return "1";
        while (true) {
            System.out.println("Check: " + check + " Second: " + second + " result = " + check * (check + 1));
            if (check * (second ++) == n) {
                System.out.println("check *= (second ++)" + (check *= (second ++)));
                check *= (second ++);
                break;
            } else {
                check *= (second++);
                second++;
            }

        }

        String answer = "";
        answer += check;
        System.out.println("Answer: " + answer);

        return answer;
    }

}
