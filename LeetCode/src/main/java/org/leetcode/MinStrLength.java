//1750. Minimum Length of String After Deleting Similar Ends

package org.leetcode;
import java.util.*;
public class MinStrLength {
    public static int minimumLength(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j && s.charAt(i)==s.charAt(j)){
            while(i+1<j && s.charAt(i)==s.charAt(i+1)){
                ++i;
            }
            while(i<j-1 && s.charAt(j) == s.charAt(j-1)){
                --j;
            }
            i++;
            j--;
        }
        return Math.max(0, j-i+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        System.out.println(minimumLength(str));
    }
}
