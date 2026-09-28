package Strings;

import java.util.Scanner;

public class ReplacingWithNewLetter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the Character To Replace");
        Character CharacterToReplace =sc.nextLine().charAt(0);
        System.out.println("Enter the Repalce Character");
        Character ReplaceCharacter=sc.nextLine().charAt(0);
        String res="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=CharacterToReplace){


            res +=ch;
        }else{
            res+=ReplaceCharacter;
        }
        }
        System.out.println(res);
        }
}
