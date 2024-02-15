package org.leetcode;
import java.util.*;
public class MaxStringReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter words in array: ");
        String words[] = new String[n];
        for(int i=0;i<n;i++){
            words[i] = sc.next();
        }

        System.out.println("No of Pairs of words with reverse String : "+maxReverseString(words));
    }

    public static int maxReverseString(String[] words) {
        int count = 0;
        for(int i=0;i< words.length;i++){
            for(int j=i+1;j< words.length;j++){
                if(words[i].charAt(0) == words[j].charAt(1)  && words[i].charAt(1) == words[j].charAt(0) ){
                    count++;
                }
            }
        }
       return count;
    }


}
