//LeetCode: 28. Find the Index of the First Occurrence in a String: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
package org.leetcode;
import java.util.*;
public class FirstOccerString {
    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        int[] arr = new int[needle.length()];
        int prev = 0, x=1;
        while(x < needle.length()){
            if(needle.charAt(x) == needle.charAt(prev)){
                arr[x] = ++prev;
                x++;
            }else{
                if(prev == 0){
                    arr[x] = 0;
                    x++;
                }else{
                    prev = arr[prev-1];
                }
            }
        }

        int j=0;
        for(int i=0;i<haystack.length();){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else{
                if(j==0){
                    i++;
                }else{
                    j=arr[j-1];
                }
            }
            if(j==needle.length()){
                return i - j;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String haystack = sc.next();
        String needle = sc.next();
        System.out.println(strStr(haystack,needle));
    }
}
