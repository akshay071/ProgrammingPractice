package org.DSA.Arrays;
import java.util.*;
public class LinearSearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Element in array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(findElement(arr, key));
    }
        public static int findElement(int[] arr,int key){
            for(int i: arr){
                if(arr[i] == key)
                    return i+1;
            }
            return -1;
        }

}
