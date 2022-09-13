package Java.java_if_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if (N % 2 != 0){
            System.out.println("Weird");
        } else if (N % 2 == 0 && 2<=N && N<=5){
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N>=6 && N<=20){
            System.out.println("Weird");
        } else if (N % 2 == 0 && N>20){
            System.out.println("Not Weird");
        }
    }
}
