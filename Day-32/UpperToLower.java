package Strings;

import java.util.Scanner;

public class UpperToLower {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String:");
        String str=sc.nextLine();
        String result="";
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)>=65&&str.charAt(i)<90){
                result+=str.charAt(i);
            }else {
                char ch=(char) (str.charAt(i)-32);
                result+=ch;
            }


        }
        System.out.println(result);
    }
}
