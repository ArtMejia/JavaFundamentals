package com.mejia.warmup;

public class warmup14 {
    public static void main(String[] args) {
        System.out.println(reverse("Hello Art"));
    }
    public static String reverse(final String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
