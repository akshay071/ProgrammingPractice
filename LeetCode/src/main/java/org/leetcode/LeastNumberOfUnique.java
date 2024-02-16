//LeetCode 1481. Least Number of Unique Integers after K Removals : https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/description/
package org.leetcode;
import java.util.*;
public class LeastNumberOfUnique {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        int[] arr = new int[]{4, 3, 1, 1, 3, 3, 2};
        //int k = sc.nextInt();
        int k = 3;
        System.out.println(findLeastNumOfUniqueInts(arr,k));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length; i++) {
            // update the frequency
            if (!map.containsKey(arr[i]))
                map.put(arr[i], 0);
            map.put(arr[i], map.get(arr[i]) + 1);
        }

        System.out.println(map);

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int length = list.size();
        for(int i=0;i< length;i++){
            k -= list.get(i);
            if (k < 0) {
                return length - i;
            }
        }
        return 0;

    }
}
