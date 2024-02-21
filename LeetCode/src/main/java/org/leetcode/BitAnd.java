package org.leetcode;
import java.util.*;
public class BitAnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(rangeBitwiseAndGreedy(x, y));
        System.out.println("\n"+andOperator(x, y));
    }

    /** Greedy Solution Mine Logic time limit exceeds */
    public static int rangeBitwiseAndGreedy(int left, int right) {
        int result = left;
        for(int i = left+1;i<right;i++){
            result = result & i;
        }
        return result;
    }

    /** Optimizes solution used Math.log concept and right shift operator*/
    public static int andOperator(int left, int right)
    {

        // Iterate over all bits of y, starting from the
        // lsb, if it's equal to 1, flip it
        for (int i = 0; i < (Math.log(right) / Math.log(2)) + 1;
             i++) {
            // repeat till x >= y, otherwise return the
            // answer.
            if (right <= left) {
                return right;
            }
            if ((right & (1 << i)) != 0) {
                right &= ~(1 << i);
            }
        }
        return right;
    }


}
