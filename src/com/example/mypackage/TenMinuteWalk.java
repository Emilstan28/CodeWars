package com.example.mypackage;

public class TenMinuteWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10)
            return false;
        int north = 0;
        int south = 0;
        int west = 0;
        int east = 0;
        for (char c : walk) {
            switch (c) {
                case 'n':
                    north++;
                    break;
                case 's':
                    south++;
                    break;
                case 'w':
                    west++;
                    break;
                case 'e':
                    east++;
                    break;
            }
        }

        return north == south && east == west;
    }
}
