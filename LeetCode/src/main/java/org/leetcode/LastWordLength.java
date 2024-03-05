package org.leetcode;
import java.util.*;
public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }
        int j = i;
        while(j>=0 && s.charAt(j) != ' '){
            j--;
        }
        return i - j;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Length 0f last word is: "+lengthOfLastWord(s));
    }
}
