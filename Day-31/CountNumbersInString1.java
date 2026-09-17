package Strings;

import java.util.Scanner;

public class CountNumbersInString1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=sc.nextLine();
        int digitCount=0;
        for (int i=0;i<word.length();i++){
            if(word.charAt(i)>=47&&word.charAt(i)<=58){
                digitCount++;
            }
        }
        System.out.println("DigitCount"+digitCount);
    }
}
