package org.leetcode;
import java.util.*;
public class RomanToInteger {
    static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int sum = 0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
        for(int i=0;i<s.length();i++){
            sum = sum + (map.get(s.charAt(i)));
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Conversion of Roman to int is: "+romanToInt(s));
    }
}
