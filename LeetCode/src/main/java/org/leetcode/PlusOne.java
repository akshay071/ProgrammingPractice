package org.leetcode;
import java.util.*;
public class PlusOne {
    public int plusOne(int[] digits) {
        return getNum(digits);
    }

    public static int getNum(int[] digits){
        int num = 0;
        for(int i: digits){
            num = num*10 + digits[i];
        }
        return num;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = {1,2,3,4};

    }
}
