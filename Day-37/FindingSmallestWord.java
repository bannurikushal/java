package Strings;

import java.util.Scanner;

public class FindingSmallestWord {
        public static void main(String agrs[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The String:");
            String str= sc.nextLine();
            String[] arr=str.split(" ");
            String res="";
            for (int i=0;i< arr.length;i++) {
                String word=arr[i];
                if (word.charAt(i)<word)
                {
                }
            }
            System.out.println(res);
        }
}
