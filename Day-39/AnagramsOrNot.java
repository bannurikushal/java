package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Str1:");
        String str1= sc.nextLine();
        System.out.println("Enter the str2:");
        String str2= sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("Not Anagrams");
        }else {
            char[] arr1=new char[str1.length()];
            for (int i=0;i< arr1.length;i++){
                arr1[i]=str1.charAt(i);
            }
            char[] arr2=new char[str2.length()];
            for (int i=0;i< arr2.length;i++){
                arr2[i]=str2.charAt(i);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean anagram=true;
            for (int i=0;i< arr1.length;i++){
                if (arr1[i]!=arr2[i]){
                    anagram=false;
                            break;
                }
            }if(anagram){
                System.out.println("Anagram");
            }else {
                System.out.println("Anagram");
            }
        }
    }
}
