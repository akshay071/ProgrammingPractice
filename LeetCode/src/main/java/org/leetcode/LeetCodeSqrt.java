package org.leetcode;
import java.util.*;
public class LeetCodeSqrt {
    public static int squareRoot(int num){
        long l = 1;
        long r = num + 1;

        while (l < r) {
            final long m = (l + r) / 2;
            if (m > num / m)
                r = m;
            else
                l = m + 1;
        }

        // l := the minimum number s.t. l * l > x
        return (int) l - 1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Number: "+ n +" Square Root: "+squareRoot(n));

    }
}
