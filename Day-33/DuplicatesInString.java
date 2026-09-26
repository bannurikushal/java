package Strings;

import java.util.Scanner;

public class LowerToUpper {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();
        String result="";
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)>=96&& str.charAt(i)<=122){
                result+=str.charAt(i);
            }else {
                char ch=(char) (str.charAt(i)+32);
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
