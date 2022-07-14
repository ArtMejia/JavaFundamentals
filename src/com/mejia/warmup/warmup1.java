package com.mejia.warmup;

public class warmup1 {

    public static void main(String[] args) {
        int[] numbers = {6, 21, 37, 58};
        getFirstValue(numbers);
        System.out.println(getFirstValue(numbers));
    }

    public static int getFirstValue(int[] arg) {
        return arg[0];
    }

}

// Create a function that takes an array containing only numbers and return the first element.

// Examples
// getFirstValue([1, 2, 3]) ➞ 1

// getFirstValue([80, 5, 100]) ➞ 80

// getFirstValue([-500, 0, 50]) ➞ -500
