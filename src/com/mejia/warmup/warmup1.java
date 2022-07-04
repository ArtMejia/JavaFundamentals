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
