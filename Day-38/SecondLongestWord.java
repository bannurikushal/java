package Strings;

import java.util.Scanner;

public class SecondLongestWord {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.nextLine();
        String [] arr=str.split(" ");
        int FirstLongestLength=0;
        String FirstLongestWord="";
        int SecondLongestLength=0;
        String SecondLongestWord="";
        for (int i=0;i< arr.length;i++){
          String word=arr[i];
          if(word.length()>FirstLongestLength){
              SecondLongestLength=FirstLongestLength;
              SecondLongestWord=FirstLongestWord;
              FirstLongestLength=word.length();
              FirstLongestWord=word;
          }else if (word.length()<FirstLongestLength && word.length()>SecondLongestLength){
              SecondLongestLength=word.length();
              SecondLongestWord=word;
          }
        }
        System.out.println(SecondLongestWord);
    }
}
