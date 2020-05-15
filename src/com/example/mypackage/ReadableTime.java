package com.example.mypackage;

public class ReadableTime {
    public String makeReadable(int seconds) {
        int hours = 0;
        if (seconds >= 3600) {
            hours = seconds / 3600;
            seconds %= 3600;
        }
        int minutes = 0;
        if (seconds >= 60) {
            minutes = seconds / 60;
            seconds %= 60;
        }
        int second = 0;
        if (seconds >= 0) {
            second = seconds;
        }

        String answer = "";
        if (hours < 10) {
            answer += "0" + hours + ":";
        } else
            answer += hours + ":";
        if (minutes < 10) {
            answer += "0" + minutes + ":";
        } else
            answer += minutes + ":";
        if (second < 10) {
            answer += "0" + second;
        } else
            answer += second;

        return answer;
    }
}
