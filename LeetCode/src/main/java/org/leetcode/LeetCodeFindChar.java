package org.leetcode;

import java.util.Scanner;
import java.util.*;

public class LeetCodeFindChar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter words in array: ");
        String words[] = new String[n];
        for(int i=0;i<n;i++){
            words[i] = sc.next();
        }



        System.out.println("Index of words containing character: "+findWordsContaining(words));
    }

    public static List<Character> findWordsContaining(String[] words) {

        Set<Character> set = new HashSet<>();
        for(int i=0;i<words.length;i++) {
            for (char c : words[i].toCharArray()) {
                set.add(c);
            }
        }
        List<Character> list = new ArrayList<>(set);
        return list;
    }

}
