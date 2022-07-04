package com.mejia.warmup;

public class warmup7 {
    public static void main(String[] args) {
        System.out.println(countWords("Hello there good guy, nice to meet ya"));
    }

    public static int countWords(String s) {
        return s.split(" ").length;
    }

}
