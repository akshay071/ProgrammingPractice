package org.example;
import java.util.*;
public class NumberOfVowelString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter words in array: ");
        String words[] = new String[n];
        for(int i=0;i<n;i++){
            words[i] = sc.next();
        }
        System.out.println("Number of vowel strings: "+countOFVowlString(words));
    }

    public static int countOFVowlString(String words[]){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u','A','E','I','O','U');
        int count = 0;
        for(int i=0;i< words.length;i++){
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length()-1))){
                count++;
            }
        }
        return count;
    }
}
