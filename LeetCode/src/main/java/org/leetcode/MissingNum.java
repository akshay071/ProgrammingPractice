package org.leetcode;
import java.util.*;
public class MissingNum {
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int ans = n*(n+1)/2;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        return ans - sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing num in array is: "+ missingNumber(arr));
    }
}
