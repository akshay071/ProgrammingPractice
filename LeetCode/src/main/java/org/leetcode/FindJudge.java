package org.leetcode;
import java.util.*;
public class FindJudge {
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int[][] trust = {{1,2}};
        System.out.println(findJudgeInTown(n,trust));
    }
    public static int findJudgeInTown(int n, int[][] trust) {
        int[] trustScore = new int[n + 1];
        for (int[] trustPair : trust) {
            trustScore[trustPair[1]]++;
            trustScore[trustPair[0]]--;
        }
        for (int i = 1; i <= n; i++) {
            if (trustScore[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
