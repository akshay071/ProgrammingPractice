package org.leetcode;
import java.util.*;
public class PlusOne {
    public int[] plusOne(int[] digits) {
        return plusArr(getNum(digits));
    }

    public static int getNum(int[] digits){
        int num = 0;
        for(int i=0; i < digits.length;i++){
            num = num*10 + digits[i];
        }
        return num;
    }

    public static int[] plusArr(int num){
        num = num + 1;
        System.out.println("Plus one num: "+num);
        Stack<Integer> stack = new Stack<>();

        while(num != 0){
            stack.push((int)num % 10);
            num /= 10;
        }

        System.out.println("\nList is: "+stack+" ");
        int size = stack.size();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = stack.pop();
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PlusOne p = new PlusOne();
        int[] num = {1,2,3,4};
        //System.out.println(p.plusOne(num));

        int[] ans = p.plusOne(num);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
