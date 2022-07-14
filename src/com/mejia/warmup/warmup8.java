package com.mejia.warmup;

public class warmup8 {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 37, 58, 92};
        System.out.println(existsHigher(numbers, 100));
    }

    public static boolean existsHigher(int[] arr, int n) {
        if (arr.length == 0)
            return false;
        for (int i : arr) {
            if (i >= n) return true;
        }
        return false;

    }
}

// Write a function that returns true if there exists at least one number that is larger than or equal to n.

// Examples
// existsHigher([5, 3, 15, 22, 4], 10) ➞ true

// existsHigher([1, 2, 3, 4, 5], 8) ➞ false

// existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true

// existsHigher([], 5) ➞ false