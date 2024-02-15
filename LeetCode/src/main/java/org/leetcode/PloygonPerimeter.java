//LeetCode Problem :2971. Find Polygon With the Largest Perimeterpackage org.leetcode;
//URL: //leetcode.com/problems/find-polygon-with-the-largest-perimeter/description/l.Arrays;
package org.leetcode;
import java.util.*;
public class PloygonPerimeter {
    public static void main(String[] args){
        int[] arr ={1,12,1,2,5,50,3};
        int n = arr.length;
        Arrays.sort(arr);
        long sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);

        long[] prefixSum = new long[n];

        // Function call
        fillPrefixSum(arr, n, prefixSum);
        for (int i = 0; i < n; i++)
            System.out.print(prefixSum[i] + " ");
        System.out.println();

        for(int i=n-1;i>1;i--){
            if(arr[i]<prefixSum[i-1]){
                sum = prefixSum[i-1];
                System.out.println(prefixSum[i]);
                break;
            }
        }
    }



    static void fillPrefixSum(int[] arr, int n, long[] prefixSum)
    {
        prefixSum[0] = arr[0];
        // Adding present element with previous element
        for (int i = 1; i < n; ++i)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
    }
}

