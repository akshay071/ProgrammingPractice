package org.DSA.String;
import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        System.out.println("Reverse Sring is: ");
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        String reverseString="";
        for(int i=0;i<str.length();i++){
            reverseString = reverseString + str.charAt(str.length()-i-1);
        }
        return reverseString;
    }
}
