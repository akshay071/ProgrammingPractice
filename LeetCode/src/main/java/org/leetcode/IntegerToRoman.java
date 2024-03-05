package org.leetcode;
import java.util.*;
public class IntegerToRoman {
    static String intToRoman(int num) {
        String[] s = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] n = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String ans ="";
        while(num != 0){
            for(int i=0;i<n.length;i++){
                while(num>=n[i]){
                    num -= n[i];
                    ans += s[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Inter in Roman form is: "+intToRoman(n));
    }
}
