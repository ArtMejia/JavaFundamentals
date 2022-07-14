package com.mejia.warmup;

public class warmup14 {
    public static void main(String[] args) {
        System.out.println(reverse("Hello Art"));
    }
    public static String reverse(final String str) {
        return new StringBuilder(str).reverse().toString();
    }

}

// Create a method that takes a string as its argument and returns the string in reversed order.

// Examples
// reverse("Hello World") ➞ "dlroW olleH"

// reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"

// reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"