package org.leetcode;
import java.util.*;
public class SqareOfSortArray {
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(ans);

        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Element in Array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] answer = sortedSquares(arr);

        System.out.println("Sorted Square Array: ");
        for(int i=0;i<n;i++){
            System.out.print(answer[i] +" ");
        }
        System.out.println();
    }

}
