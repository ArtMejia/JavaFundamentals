package com.mejia.warmup;

public class WarmUpSet3Bonus2 {
    public static void main(String[] args) {
        System.out.println(divisible(150));
    }

    public static boolean divisible(int num) {
        if (num % 100 == 0) {
            return true;
        } else
            return false;
    }
}

//Create a function that takes an integer and returns true if it's divisible by 100, otherwise return false.
//
//Examples
//divisible(1) ➞ false
//
//divisible(1000) ➞ true
//
//divisible(100) ➞ true
