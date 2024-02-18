//2. Add Two Numbers https://leetcode.com/problems/add-two-numbers/description/
//My Solution
package org.leetcode;
import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        l2.add(5);
        l2.add(6);
        l2.add(4);

       // System.out.println(addList(l1,l2));
        addList(l1,l2);
    }
    public static void addList(LinkedList l1, LinkedList l2){
        LinkedList<Integer> answer = new LinkedList<>();

        int num1 = getNum(l1);
        int num2 = getNum(l2);
        System.out.println("num1: "+ num1 + " num2: "+ num2);
        int result = num1+num2;
        //result = reverseNum(result);
        int temp;
        while(result>0){
            temp = result%10;
            answer.add(temp);
            result /= 10;
        }
        System.out.println(answer);
    }
    public static int getNum(LinkedList l1){
        int num=0;
        for(int i=0;i<l1.size();i++){
            num *= 10;
            num = num + (int) l1.get(i);
        }
        num = reverseNum(num);
        return num;
    }

    public static int reverseNum(int num){
        int rev_num=0;
        while(num>0){
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
}


/**
 * LeetCode optimize solution
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode current = answer;
        int carry = 0;
        while(l1 != null || l2 != null || carry > 0){
            if(l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(carry%10);
            carry /= 10;
            current = current.next;
        }
        return answer.next;
    }
}

 */
