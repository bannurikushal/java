package Strings;

import java.util.Scanner;

public class FindingLongestWord {

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String:");
        String str= sc.nextLine();
        String[] arr=str.split(" ");
        String res="";
        for (int i=0;i< arr.length;i++){
            String word=arr[i];
             if(word.length()>res.length()){
                 res+=word;
             }
        }
        System.out.println(res);

    }
}
