package Strings;

import java.util.Scanner;

public class FrequentCharacter {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The String:");
        String str= sc.nextLine();
        int [] arr=new int[256];
        for (int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
            }
        int maxcount=0;
        char frequentCharacter = ' ';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>maxcount) {
                maxcount = arr[str.charAt(i)];
                frequentCharacter = str.charAt(i);
            }

        }
        System.out.println("Frequentcharacter"+frequentCharacter);

    }
}
