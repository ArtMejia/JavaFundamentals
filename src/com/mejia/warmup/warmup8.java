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
