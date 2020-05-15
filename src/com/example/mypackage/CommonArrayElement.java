package com.example.mypackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonArrayElement {
    public static int findIt(int[] a) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int position : a) {
            if (map.containsKey(position)) {
                map.put(position,map.get(position) +1);
            } else {
                map.put(position, 1);
            }
        }

        int answer = 0;

        int frequency;

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        System.out.println(entries);

        for (Map.Entry<Integer, Integer> entry : entries) {
//            System.out.println("Going in the loop");
            frequency = entry.getValue();
            if (frequency % 2 == 1) {
                answer = entry.getKey();
                System.out.println("Frequency: " + frequency + " Entry: " + answer);
            }
        }
        return answer;
    }
}
