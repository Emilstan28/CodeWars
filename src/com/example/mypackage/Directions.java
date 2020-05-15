package com.example.mypackage;

public class Directions {
    public static String[] dirReduc(String[] arr) {
        int reduction = 2;
        int first = 0;
        int second = 0;
        int successfulLoop = 0;
        char north = 'N';
        char south = 'S';
        char west = 'W';
        char east = 'E';
        String[] backup;
        for (String s : arr) {
            System.out.println("Strings in arr at the start");
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i ++) {
            System.out.println("For triggered: " + i);
            if (i == arr.length - 1) {
                i = 0;
            }
            if  (arr.length == 1 || successfulLoop > arr.length){
                break;
            }
            if (Character.toUpperCase(arr[i].toCharArray()[0]) == Character.toUpperCase(north) && Character.toUpperCase(arr[i + 1].toCharArray()[0]) == Character.toUpperCase(south) ||
                Character.toUpperCase(arr[i].toCharArray()[0]) == Character.toUpperCase(south) && Character.toUpperCase(arr[i + 1].toCharArray()[0]) == Character.toUpperCase(north) ||
                Character.toUpperCase(arr[i].toCharArray()[0]) == Character.toUpperCase(west) && Character.toUpperCase(arr[i + 1].toCharArray()[0]) == Character.toUpperCase(east) ||
                Character.toUpperCase(arr[i].toCharArray()[0]) == Character.toUpperCase(east) && Character.toUpperCase(arr[i + 1].toCharArray()[0]) == Character.toUpperCase(west)) {
                System.out.println("If triggered");
                first = i;
                second = i +1;
                System.out.println("First: " + first + " Second: " + second);
            }
            if (second != 0) {
                successfulLoop = 0;
                backup = new String[arr.length - reduction];
                for (int o = 0; o < arr.length; o ++) {
                    if (o < first) {
                        backup[o] = arr[o];
                    } else if (o > second){
                        backup[o - reduction] = arr[o];
                    }
                }
                first = 0;
                second = 0;
                 arr = backup;
                i = 0;
                System.out.println("I after the if second != 0: " + i);
            }
            System.out.println("arr.length: " + arr.length);
            if (i == arr.length - 1) {
                i = 0;
            }
            System.out.println("I: " + i);
            System.out.println("arr Strings: ");
            for (String s : arr) {
                System.out.println(s);
            }
            successfulLoop++;
        }

        return arr;
    }

}
