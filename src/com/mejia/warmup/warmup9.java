package com.mejia.warmup;

public class warmup9 {
    public static void main(String[] args) {
        System.out.println(getCount("Hello there mate"));
    }

    public static int getCount(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }
}

// Create a function that takes a string and returns the number (count) of vowels contained within it.

// Examples
// countVowels("Celebration") ➞ 5

// countVowels("Palm") ➞ 1

// countVowels("Prediction") ➞ 4