package com.example.mypackage;

public class Greed {
    public static int greedy(int[] dice){
        int[] diceResults = new int[6];
        int results = 0;

        for (int i = 0; i < dice.length; i++) {
            System.out.println("I: " + i + " dice[i]: " + dice[i]);
            switch (dice[i]) {
                case 1: {
                    diceResults[0]++;
                    break;
                }
                case 2: {
                    diceResults[1]++;
                    break;
                }
                case 3: {
                    diceResults[2]++;
                    break;
                }
                case 4: {
                    diceResults[3]++;
                    break;
                }
                case 5: {
                    diceResults[4]++;
                    break;
                }
                case 6: {
                    diceResults[5]++;
                    break;
                }
            }
        }

        for (int i = 0; i < diceResults.length; i++) {
            System.out.println("diceResults[" + i + "]: " + diceResults[i]);
        }

        for (int i = 0; i < diceResults.length; i++) {
            if (diceResults[i] > 3) {
                switch (i) {
                    case 0: {
                        results += 1000;
                        diceResults[i] -= 3;
                        break;
                    }
                    case 1: {
                        results += 200;
                        break;
                    }
                    case 2: {
                        results += 300;
                        break;
                    }
                    case 3: {
                        results += 400;
                        break;
                    }
                    case 4: {
                        results += 500;
                        diceResults[i] -= 3;
                        break;
                    }
                    case 5: {
                        results += 600;
                        break;
                    }
                }
            }

            if (i == 0 && diceResults[i] > 0) {
                System.out.println("First if triggered");
                System.out.println("diceResults[" + i + "]: " + diceResults[i] + " I: " + i);
                results += i * 100;
            }
            if (i == 4 && diceResults[i] > 0) {
                System.out.println("Second if triggered");
                System.out.println("diceResults[" + i + "]: " + diceResults[i] + " I: " + i);
                results += i * 50;
            }
        }

        return results;
    }
}
