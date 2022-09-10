package DaysOfCodeJava.day_0Hello_World;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);
        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();
        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");
        // Print the contents of inputString to stdout.
        System.out.println(inputString);
    }
}
