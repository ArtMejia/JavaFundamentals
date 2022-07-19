package com.mejia.warmup;

public class WarmUp18 {
    public static void main(String[] args) {
        System.out.println(hackerSpeak("Here we go!"));
    }

    public static String hackerSpeak(String str) {
        return str.replace('a', '4')
                .replace('e', '3')
                .replace('i', '1')
                .replace('o', '0')
                .replace('s', '5');
    }
}

//Create a function that takes a string as an argument and returns a coded (h4ck3r 5p34k) version of the string.
//
//Examples
//hackerSpeak("javascript is cool") ➞ "j4v45cr1pt 15 c00l"
//
//hackerSpeak("programming is fun") ➞ "pr0gr4mm1ng 15 fun"
//
//hackerSpeak("become a coder") ➞ "b3c0m3 4 c0d3r"
