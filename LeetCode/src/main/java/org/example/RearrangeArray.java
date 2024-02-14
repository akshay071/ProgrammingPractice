//LeetCode RearrangeArray:https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
package org.example;
import java.util.*;
public class RearrangeArray {
    public static void rearrangeSignArray(int[] nums) {
        int[] ans = new int[nums.length];
        int i=0;
        int j=1;
        for(int k=0;k<nums.length;k++){
            if(nums[k]>0){
                ans[i]=nums[k];
                i+=2;
            }else{
                ans[j]=nums[k];
                j+=2;
            }
        }
        for(int z=0;z<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rearrangeSignArray(arr);
    }
}
