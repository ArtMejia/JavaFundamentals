package Interview;

import java.util.List;

public class divisible_sum_pairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            for ( int j = i + 1; j < n; j++) {
                if( (ar.get(i) + ar.get(j) ) % k == 0) res++;
            }
        }
        return res;
    }
}
