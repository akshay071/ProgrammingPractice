package org.leetcode;
import java.util.*;
public class MaxNumPairs {
    public static int[] numberOfPairs(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        int pairs = 0;
        for(int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && nums[i] != -1) {
                    pairs++;
                    nums[i] = -1;
                    nums[j] = -1;
                }
            }
        }
        int remain = nums.length - (pairs*2);
        ans[0] = pairs;
        ans[1] = remain;

        System.out.println("Pairs are: "+pairs+" Not pairs: " + remain+"\n\n");
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,3,2,1,3,2,2};
        int[] ans = numberOfPairs(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
