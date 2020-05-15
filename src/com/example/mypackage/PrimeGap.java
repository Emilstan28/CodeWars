package com.example.mypackage;

public class PrimeGap {
    public static long[] gap(int g, long m, long n) {
        long[] gapNum = new long[2];
        long checker;
        long firstPrime = 0;
        long secondPrime = 0;

        if (m - n > g)
            return null;
        for (long i = m; i <= n; i++) {
            checker = (long) Math.sqrt(i);
            if (isPrime(i, checker)) {
                System.out.println(i + " is prime");
                if (firstPrime == 0)
                    firstPrime = i;
                else
                    secondPrime = i;
            }
            if (firstPrime != 0 && secondPrime != 0) {
                System.out.println("First and second prime aren't empty");
                System.out.println("firstPrime: " + firstPrime + "\nsecondPrime: " + secondPrime);
                System.out.println("secondPrime - firstPrime " + (secondPrime - firstPrime));
                System.out.println("==============================================\n\n\n\n\n\n");
                if (secondPrime - firstPrime == g) {
                    gapNum[0] = firstPrime;
                    gapNum[1] = secondPrime;
                    return gapNum;
                } else {
                    i = secondPrime - 1;
                    firstPrime = 0;
                    secondPrime = 0;
                }
            }
        }

        return null;
    }

    public static boolean isPrime(long i, long limit) {
        int evenDivision = 0;
        double truncate;
        for (double o = 2; o <= limit; o++){
            System.out.println("FOR IN ISPRIME: " + o);
            truncate = o;
            if (i / truncate == (int) (i / truncate)) {
                System.out.println(truncate + " truncate. Even division: " + evenDivision);
                System.out.println("i / truncate: " + i / truncate);
                System.out.println("(int) (i / truncate): " + (int) (i / truncate));
                evenDivision++;
            }
            if (evenDivision == 0 && o == limit) {
                System.out.println("====================================================== \nReturning true");
                return true;
            }
        }
        System.out.println("====================================================== \nReturning False");
        return false;
    }
}
