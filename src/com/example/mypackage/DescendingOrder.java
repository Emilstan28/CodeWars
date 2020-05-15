package com.example.mypackage;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        int manipulatee = num;
        int temporaryHolder = 0;
        int zeroValid = 0;
        int reversedNum;

        if (manipulatee == 0){
            return 0;
        }

    /*
    Take the number and cut off the last digit, save it [V]
    check if the next digit of the number is bigger than the one you last saved [V]
    if it is, cut the last digit off, save it somewhere else, then check again. [V]
    if the condition is true again, divide the reversing number by 10, multiply the saved digit by 10, add the new one [V]
    once the condition is false add that digit to the reversing number as well as others that fit the condition,
    then go through and return the digits as they were until there's none left [V]

    return the reversed number [V]
    
    I am brilliant.
    */

        reversedNum = manipulatee % 10;
//        System.out.println(reversedNum);
        manipulatee /= 10;
//        System.out.println(manipulatee);

        while(manipulatee != 0){
            System.out.println("ReversedNum: " + reversedNum);
            System.out.println("Manipulatee: " + manipulatee);
            System.out.println("ZeroValid at the start " + zeroValid);
            if (manipulatee % 10 == 0) {
                zeroValid++;
                manipulatee /= 10;
            }

            while (reversedNum % 10 <= manipulatee % 10){
                System.out.println("Reversed num less");
                if (reversedNum / 10 == 0) {
                    System.out.println("Temporary holder, one digit revNum: " + temporaryHolder);
                    System.out.println("ReversedNum one digit: " + reversedNum);
                    temporaryHolder *= 10;
                    temporaryHolder += reversedNum;
                    reversedNum = manipulatee % 10;
                    reversedNum *= 10;
                    reversedNum += temporaryHolder % 10;
                    manipulatee /= 10;
                    temporaryHolder /= 10;
                    System.out.println("Temporary holder, one digit revNum after: " + temporaryHolder);
                    System.out.println("ReversedNum one digit after: " + reversedNum);
                } else {
                    System.out.println("Temporary holder, more than one digit: " + temporaryHolder);
                    System.out.println("RevNum more than one digit: " + reversedNum);
                    temporaryHolder *= 10;
                    temporaryHolder += reversedNum % 10;
                    reversedNum /= 10;
                }
            }

            while (reversedNum % 10 > manipulatee % 10 && manipulatee != 0 && temporaryHolder %10 <= manipulatee % 10 && manipulatee % 10 != 0){
                reversedNum *=10;
                reversedNum += manipulatee %10;
                System.out.println("Middle reversed = " + reversedNum);
                manipulatee /= 10;
                System.out.println("Middle manipulatee = " + manipulatee);
            }

            while(temporaryHolder != 0){
                reversedNum *= 10;
                reversedNum += temporaryHolder % 10;
                System.out.println("Near final reversedNum = " + reversedNum);
                temporaryHolder /= 10;
                System.out.println("Final tempHolder = " + temporaryHolder);
            }
        }

        System.out.println("ReversedNum = " + reversedNum);

        while (zeroValid != 0) {
            System.out.println("Zero valid at the end: " + zeroValid);
            reversedNum *= 10;
            zeroValid--;
        }


        return reversedNum;


    }
}
