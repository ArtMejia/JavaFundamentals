package com.mejia.warmup;

public class warmup9 {
    public static void main(String[] args) {
        System.out.println(getCount("Hello there mate"));
    }

    public static int getCount(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }
}
