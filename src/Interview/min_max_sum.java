package Interview;

import java.util.*;

public class min_max_sum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long minSum = 0;
        long maxSum = 0;
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            minSum = minSum + arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            maxSum = maxSum + arr.get(i);
        }
        System.out.println(minSum + " " + maxSum);
    }
}