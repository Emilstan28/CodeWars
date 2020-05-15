package com.example.mypackage;

public class StringMerge {
    public static boolean isMerge(String s, String part1, String part2) {
        char[] stringToReconstruct = s.toCharArray();
        char[] stringPartOne = part1.toCharArray();
        char[] stringPartTwo = part2.toCharArray();
        boolean found = false;
        int i = 0;
        int j = 0;
        System.out.println(stringPartOne.length);

        for (char c : stringToReconstruct) {
            if (i < stringPartOne.length)
                if (stringPartOne[i] == c) {
                    found = true;
                        i++;
                }
            if (!found) {
                if (j < stringPartTwo.length)
                    if (stringPartTwo[j] == c) {
                        found = true;
                        j++;
                }
            }
            if (!found)
                return false;
            else
                found = false;
        }
        return true;
    }
}
