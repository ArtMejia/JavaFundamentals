package Java.java_stdin_stdout2;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int myInt = scan.nextInt();
        double myDouble = scan.nextDouble();
        String myStr = scan.nextLine();
        String b = scan.nextLine();

        System.out.println("String: " + myStr + b);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }
}
