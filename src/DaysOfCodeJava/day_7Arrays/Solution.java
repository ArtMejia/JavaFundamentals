package DaysOfCodeJava.day_7Arrays;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int[] arr=new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        for(int i=n-1;i>-1;i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
