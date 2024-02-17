//LeetCode 1642. Furthest Building You Can Reach : https://leetcode.com/problems/furthest-building-you-can-reach/description/
package org.leetcode;
import java.util.*;
public class FurthestBuilding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int bricks = sc.nextInt();
        int ladders = sc.nextInt();
        System.out.println(furthestBuilding(arr, bricks, ladders));
    }

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for(int i=0;i<heights.length-1;i++){
            int diff = heights[i+1] - heights[i];
            if(diff>0){
                list.add(diff);
                if(list.size()>ladders){
                    bricks -= list.poll();
                    if(bricks<0){
                        return i;
                    }
                }
            }
        }
        return heights.length - 1;
    }
}
