package Strings;

import java.util.Scanner;

public class UniqueOfString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.nextLine();
        String res="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                res+=ch+" ";
            }
        }
        System.out.println(res);
    }
}
