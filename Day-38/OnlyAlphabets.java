package Strings;

import java.util.Scanner;

public class OnlyAlphabets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.nextLine();
        boolean isOnlyAlphabet=true;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!(ch>=65&&ch<=90 || ch>=97&&ch<=122)){
                isOnlyAlphabet=false;
                break;
            }
        }if(isOnlyAlphabet){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
