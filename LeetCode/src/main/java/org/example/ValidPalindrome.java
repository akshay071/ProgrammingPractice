//Leet Code Valid palindrome https://leetcode.com/problems/valid-palindrome/description/
package org.example;
import java.util.*;
public class ValidPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }


    public static boolean isPalindrome(String str){
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}

