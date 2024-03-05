package org.leetcode;
import java.util.*;
public class MaxBinNum {
    public static String maximumOddBinaryNumber(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ++cnt;
            }
        }
        return "1".repeat(cnt - 1) + "0".repeat(s.length() - cnt) + "1";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(maximumOddBinaryNumber(str));
    }
}
