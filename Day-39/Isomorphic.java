package Strings;

import java.util.Scanner;

public class Isomorphic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Str1:");
        String str1= sc.next();
        System.out.println("Enter the Str2:");
        String str2= sc.next();
        boolean isIsomorphic=true;
        for (int i=0;i<str1.length();i++){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            for (int j=0;j<str1.length();j++){
                if(str1.charAt(j)==ch1&&str2.charAt(j)!=ch2){
                    isIsomorphic=false;
                }
                if(str2.charAt(j)==ch2 && str1.charAt(j)!=ch1){
                    isIsomorphic=false;
                }
            }
        }
        if (isIsomorphic){
            System.out.println("Isomophic");
        }else {
            System.out.println("Not Isomophic");
        }
    }
}
