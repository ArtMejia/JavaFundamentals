package Interview;

import java.util.ArrayList;
import java.util.List;

public class breaking_the_records {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> recordsArray = new ArrayList<Integer>();
        recordsArray.add(0);
        recordsArray.add(0);

        int minScore = scores.get(0);
        int maxScore = scores.get(0);

        int minRecord = 0;
        int maxRecord = 0;

        for (int i=0; i<scores.size(); i++) {
            if (scores.get(i) > maxScore) {
                maxScore = scores.get(i);
                maxRecord++;
            }
            else if (scores.get(i) < minScore) {
                minScore = scores.get(i);
                minRecord++;
            }
        }
        recordsArray.set(0, maxRecord);
        recordsArray.set(1, minRecord);
        return recordsArray;
    }
}
