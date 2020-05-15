package com.example.mypackage;

public class NumberIntoTime {
    public static String formatDuration(int seconds) {

        if (seconds == 0)
            return "now";

        int[] numbers = new int[5];
        int year = 31536000;
        int day = 86400;
        int hour = 3600;
        int minute = 60;
        String answer = "";

        if (seconds >= year) {
            numbers[0] = seconds / year;
            seconds %= year;
        }
        if (seconds >= day) {
            numbers[1] = seconds / day;
            seconds %= day;
        }
        if (seconds >= hour) {
            numbers[2] = seconds / hour;
            seconds %= hour;
        }
        if (seconds >= minute) {
            numbers[3] = seconds / minute;
            seconds %= minute;
        }
        if (seconds >= 1) {
            numbers[4] = seconds;
        }

        for (int i = 0; i < numbers.length; i++) {
            switch (i) {
                case 0:
                    if (numbers[i] > 0) {
                        answer += numbers[0] + " year";
                    if (numbers[i] > 1) {
                        answer += "s";
                    }
                    if (checkForNext(numbers, i) > 1)
                        answer += ", ";
                    else if (checkForNext(numbers, i) == 1)
                        answer += " and ";
                    else
                        return answer;
                    }
                    break;
                case 1:
                    if (numbers[i] > 0) {
                        answer += numbers[1] + " day";
                    if (numbers[i] > 1) {
                    answer += "s";
                    }
                    if (checkForNext(numbers, i) > 1)
                        answer += ", ";
                    else if (checkForNext(numbers, i) == 1)
                        answer += " and ";
                    else
                        return answer;
                    }
                    break;
                case 2:
                    if (numbers[i] > 0) {
                        answer += numbers[2] + " hour";
                    if (numbers[i] > 1) {
                    answer += "s";
                    }
                    if (checkForNext(numbers, i) > 1)
                        answer += ", ";
                    else if (checkForNext(numbers, i) == 1)
                        answer += " and ";
                    else
                        return answer;
                    }
                    break;
                case 3:
                    if (numbers[i] > 0) {
                        answer += numbers[3] + " minute";
                    if (numbers[i] > 1) {
                    answer += "s";
                    }
                    if (checkForNext(numbers, i) > 1)
                        answer += ", ";
                    else if (checkForNext(numbers, i) == 1)
                        answer += " and ";
                    else
                        return answer;
                    }
                    break;
                case 4:
                    if (numbers[i] > 0) {
                        answer += numbers[4] + " second";
                    } if (numbers[i] > 1) {
                    answer += "s";
                    }
            }
        }
        return answer;
    }

    public static int checkForNext(int[] arr, int position) {
        int next = 0;
        for (int i = position + 1; i < arr.length; i++) {
            if (arr[i] > 0) {
                next++;
            }
        }

        return next;
    }
}
