package Java.datatypes;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        for(int i = 0; i < choice; i++) {

            try {
                long n = scan.nextLong();

                System.out.println(n + " can be fitted in:");
                if(n >= -128 && n <= 127)
                    System.out.println("* byte");
                if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("* short");
                if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(scan.next()+" can't be fitted anywhere.");
            }
        }
    }
}

