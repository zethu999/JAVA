// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class sumOfOdd {
    public static int SumOfOdd(int n) {
        int s=0;
        for(int i=1; i<=n; i++) {
            if(i%2!=0) {
                s+=i;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = SumOfOdd(n);
        System.out.println("The sum of odd numbers from "+"1 to "+n+" is "+res);
    }
}
