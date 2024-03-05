package org.leetcode;
import java.util.*;
public class BagOfToken {
    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0;
        int j = tokens.length - 1;
        int ans = 0;
        int token = 0;
        while(i<=j){
            if(power >= tokens[i]){
                power -= tokens[i];
                ++token;
                ans = Math.max(ans,token);
                i++;
            }else if(token > 0){
                power += tokens[j];
                --token;
                j--;
            }else{
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{100,200,300,400};
        int power = 200;
        System.out.println(bagOfTokensScore(arr, power));
    }
}
