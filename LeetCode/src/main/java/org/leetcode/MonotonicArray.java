package org.leetcode;
import java.util.*;
public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                isIncreasing = false;
            }
            if(nums[i] < nums[i-1]){
                isDecreasing = false;
            }
            if(!isIncreasing && !isDecreasing){
                return false;
            }
        }
        return true;
    }

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {6,5,4,4};
        System.out.println(isMonotonic(nums));
    }


}
