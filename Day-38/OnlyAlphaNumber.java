package Strings;

import java.util.Scanner;

public class OnlyAlphaNumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.nextLine();
        boolean isOnlyAlphaNumber=true;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!(ch>='0'&& ch<='9') && (ch>=65&&ch<=90 || ch>=97&&ch<=122)){
                isOnlyAlphaNumber=true;
                break;
            }
        }if(isOnlyAlphaNumber){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
