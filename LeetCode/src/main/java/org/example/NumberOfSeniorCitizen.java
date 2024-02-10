package org.example;
import java.util.*;
public class NumberOfSeniorCitizen {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter words in array: ");
        String words[] = new String[n];
        for(int i=0;i<n;i++){
            words[i] = sc.next();
        }
        System.out.println("No of Person more than 60 year Age : "+personMorethanSixty(words));
    }

    public static int personMorethanSixty(String[] words){
        String age = "";
        List<Integer> list = new ArrayList<>();
        int result;
        int count = 0;
        for(int i=0;i<words.length;i++){
            age = words[i].substring(11,13);
            result = Integer.parseInt(age);
            list.add(result);
        }

        Iterator itr = list.iterator();
        while (itr.hasNext())
        {
            int x = (Integer)itr.next();
            if (x > 60 )
                count++;
        }

        return count;
    }
}
