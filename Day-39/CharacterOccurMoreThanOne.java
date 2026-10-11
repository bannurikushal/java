package Strings;

import java.util.Scanner;

public class CharacterOccurMoreThanOne {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str= sc.nextLine();
        int[] arr=new int[256];
        for (int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        for (int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]>1){
                System.out.print(str.charAt(i));
                arr[str.charAt(i)]=0;
            }
        }
    }
}
