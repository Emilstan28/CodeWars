package com.example.mypackage;

import java.util.ArrayList;

public class LongestConsString {
    public static String longestConsec(String[] strarr, int k) {
        System.out.println("The program is starting");
        int defaultLength = 0;
        int dynamicLength = 0;
        StringBuilder solution = new StringBuilder();
        if (strarr.length == 0 || k > strarr.length || k <= 0) {
            return "";
        }
        ArrayList<Integer> listOfPositions = new ArrayList<>();
        ArrayList<Integer> alternatePositions = new ArrayList<>();
        ArrayList<Integer> answers = new ArrayList<>();
        for (int i = 0; i < k; i++){
            defaultLength += strarr[i].length();
            listOfPositions.add(i);
        }

        for (int position = k; position < strarr.length; position++){
            System.out.println("Going into the for");
            alternatePositions.removeAll(alternatePositions);
         for (int i = 0; i < listOfPositions.size(); i++) {

             int var = listOfPositions.get(i);
             var++;
             alternatePositions.add(i, var);
         }
         for (int o = alternatePositions.get(0); o <= alternatePositions.get(alternatePositions.size() -1); o++) {
//             System.out.println("alternatePositions.get(alternatePositions.size() - 1) = " + alternatePositions.get(alternatePositions.size() - 1));
//             System.out.println("O in for length: " + o);
             dynamicLength += strarr[o].length();
//             System.out.println("Dynamic length: " + dynamicLength + " default length: " + defaultLength);
         }

         if (dynamicLength > defaultLength) {
//             System.out.println("If triggered, dynamic length bigger");
//             System.out.println("answers.size: " + answers.size());
             if (answers.size() > 1)
                answers.removeAll(answers);
             defaultLength = dynamicLength;
             int fix = 0;
             for (int o = alternatePositions.get(0); o <= alternatePositions.get(alternatePositions.size() -1); o++) {
                 answers.add(alternatePositions.get(fix));
                 fix++;
             }
         }
         if (position == strarr.length -1 && answers.isEmpty()) {
//             System.out.println("Second if triggered, answers empty, going to the start");
             for (int i = 0; i < k; i++){
                 answers.add(i);
             }
         }

            listOfPositions.removeAll(listOfPositions);
        for (int i = 0; i < alternatePositions.size(); i++){
//            System.out.println("Going into final for in for");
//            System.out.println("ListOfPositions size: " + listOfPositions.size());
            listOfPositions.add(alternatePositions.get(i));
//            System.out.println("ListOfPositions size: " + listOfPositions.size());
        }
            dynamicLength = 0;
        }

        System.out.println("Answers.size: " + answers.size() + " strarr.length: " + strarr.length);

        for (int i = 0; i < answers.size(); i++) {
            solution.append(strarr[answers.get(i)]);
        }

        return solution.toString();
    }
}
