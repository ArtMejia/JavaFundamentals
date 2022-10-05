package DaysOfCodeJava.day_7Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        bufferedReader.close();

        List<Integer> reversed = new ArrayList<Integer>();
        String reversedString = "";

        for (int i = n; i > 0; i--) {
            reversed.add(arr.get(i - 1));
            reversedString += (arr.get(i - 1).toString());
            reversedString += " ";
        }
        System.out.println(reversedString);
    }
}

