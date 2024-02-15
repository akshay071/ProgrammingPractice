package org.DSA.Arrays;
import java.util.*;
public class ArrrayRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
        }
        int dist = sc.nextInt();
        leftRotate(arr,dist);
        printArray(arr);
    }

    public static void leftRotate(int[] array,int distance){
        if (distance==0) {
            return;
        }
        int n = array.length;
        distance = distance % n;
        reverseArray(array,0,distance-1);
        reverseArray(array,distance,n-1);
        reverseArray(array,0,n-1);
    }


    public static void reverseArray(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
