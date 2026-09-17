package Strings;

import java.util.Scanner;

public class CountNumbersInString {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The word");
        String word=sc.nextLine();
        int digitCount=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='0'||word.charAt(i)=='1'||word.charAt(i)=='2'||word.charAt(i)=='3'||
                    word.charAt(i)=='4'|| word.charAt(i)=='5'||word.charAt(i)=='6'||word.charAt(i)=='7'||
                    word.charAt(i)=='8'||word.charAt(i)=='9'){
                digitCount++;
            }
        }
        System.out.println("DigitCount:"+digitCount);

    }
}
