package com.example.mypackage;

public class SumOfInts {
    public int GetSum(int a, int b){
        int sum = 0;
        if (a > b) {
            for (int i = b; i <= a; i ++){
                System.out.println("Sum: " + sum + ", I: " + i);
                sum += i;
            }
        }
        if (b > a){
            for (int i = a; i <= b; i ++){
                System.out.println("Sum: " + sum + ", I " + i);
                sum += i;
            }
        }
        if (b == a){
            sum = b;
        }
        return sum;
    }
}
