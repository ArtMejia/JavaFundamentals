package Interview;

import java.util.*;

public class plus_minus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        double posCounter = 0;
        double negCounter = 0;
        double zeroCounter = 0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) < 0) {
                negCounter++;
            } else if (arr.get(i) > 0) {
                posCounter++;
            } else {
                zeroCounter++;
            }
        }

        double negRatio = negCounter / n;
        double posRatio = posCounter / n;
        double zeroRatio = zeroCounter / n;

        System.out.println(posRatio);
        System.out.println(negRatio);
        System.out.println(zeroRatio);
    }
}