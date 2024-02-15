package org.DSA.String;
import java.util.*;
public class RotateString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int d = sc.nextInt();

        System.out.println("Rotate String Left: "+ rotateStringLeft(str,d));
        System.out.println("Rotate String Left: "+ rotateStringRight(str,d));
    }

    public static String rotateStringLeft(String str, int dist){
        return str.substring(dist) + str.substring(0,dist);
    }

    public static String rotateStringRight(String str, int dist){
        return rotateStringLeft(str,str.length()-dist);
    }
}
