package com.mejia.warmup;

public class WarmUpSet4No15 {
    public static void main(String[] args) {
        System.out.println(makesTen(2, 8));
    }

    public static boolean makesTen(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        } else
            return false;
    }
}

//Create a function that takes two arguments. Both arguments are integers, a and b. Return true if one of them is 10 or if their sum is 10.
//
//Examples
//makesTen(9, 10) ➞ true
//
//makesTen(9, 9) ➞ false
//
//makesTen(1, 9) ➞ true
