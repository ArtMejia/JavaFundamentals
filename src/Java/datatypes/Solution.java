package Java.datatypes;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        for(int i=0; i<choice; i++) {

            try {
                long x=scan.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                    System.out.println("* short");

                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                    System.out.println("* int");

                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(scan.next()+" can't be fitted anywhere.");
            }
        }
    }
}

