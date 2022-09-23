package algorithms;

import java.util.*;

public class solve_me_first {

        static int solveMeFirst(int a, int b) {
            return a + b;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a;
            a = scan.nextInt();
            int b;
            b = scan.nextInt();
            int sum;
            scan.close();
            sum = solveMeFirst(a, b);
            System.out.println(sum);
        }
    }

