package org.DSA.Arrays;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array: ");
        int[] reverseArr = reverseArray(arr,size);
        for(int i:reverseArr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int[] reverseArray(int[] array, int size){
        int[] result = new int[size];
        for(int i=0;i<size;i++){
            result[i] = array[array.length - i -1];
        }
        return result;
    }
}
