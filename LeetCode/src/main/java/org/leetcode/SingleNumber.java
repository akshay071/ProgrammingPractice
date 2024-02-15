//LeetCode SingleNum : https://leetcode.com/problems/single-number/description/
//Learning using for loop exceeds time limit using xor is better way because by xor logic 0 ^ 0 is 0, 1 ^ 1 is 0, 1 ^ 0 is 1 and 0 ^ 1 is 1
package org.leetcode;
import java.util.*;
public class SingleNumber {
    public static int singleNum(int num[]){
        int result = 0;
        for(int i=0; i<num.length; i++){
            result ^= num[i];
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        System.out.println(singleNum(num));

    }
}

/*TestCases
1.num = [4,1,2,1,2]
2.num = [2,2,1]
3.num = [1]
 */
