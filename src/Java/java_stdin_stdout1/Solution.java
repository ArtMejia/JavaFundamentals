package Java.java_stdin_stdout1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number:");
        int a = scan.nextInt();
        // Complete this line
        System.out.println("Enter second number:");
        int b = scan.nextInt();
        // Complete this line
        System.out.println("Enter third number:");
        int c = scan.nextInt();

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);

        System.out.println("Enter fourth number:");
        int d = Integer.parseInt(keyboard.readLine());

        System.out.println(d);
    }
}
