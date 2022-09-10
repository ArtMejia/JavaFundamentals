package Java.java_stdin_stdout1;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        int myInt1 = scanner.nextInt();
        int myInt2 = scanner.nextInt();
        int myInt3 = scanner.nextInt();
        scanner.close();

        System.out.println(myInt1);
        System.out.println(myInt2);
        System.out.println(myInt3);
    }
}
