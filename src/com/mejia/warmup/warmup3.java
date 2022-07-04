package com.mejia.warmup;

public class warmup3 {
    public static void main(String[] args) {
        int[] numbers = {21, 37, 58 ,92};
        int item = 59;
        System.out.println(search(numbers, item));

    }

    public static int search(int arr[], int item) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==item)
                return i;
        }
        return -1;
    }

}
