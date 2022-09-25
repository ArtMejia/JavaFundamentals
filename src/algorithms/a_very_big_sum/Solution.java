package algorithms.a_very_big_sum;

import java.util.List;

public class Solution {
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }
}

