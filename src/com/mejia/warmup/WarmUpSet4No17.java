package com.mejia.warmup;

public class WarmUpSet4No17 {
    public static void main(String[] args) {
        System.out.println(match("hello", "HeLLo"));
    }


    public static boolean match(String str1, String str2) {
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            return true;
        } else
            return false;
    }
}

//Write a function that validates whether two strings are identical. Make it case insensitive.
//
//Examples
//match("hello", "hELLo") ➞ true
//
//match("motive", "emotive") ➞ false
//
//match("venom", "VENOM") ➞ true
//
//match("mask", "mAskinG") ➞ false