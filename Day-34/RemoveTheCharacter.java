package Strings;

import java.util.Scanner;

public class RemoveTheCharacter {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre The String:");
        String str= sc.nextLine();
        System.out.println("Enter the Character To Remove");
        Character CharacterToRemove=sc.next().charAt(0);
        String res="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=CharacterToRemove){
                res+=ch;
            }
        }
        System.out.println(res);

    }
}
