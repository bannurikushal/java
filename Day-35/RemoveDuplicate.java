package Strings;

import java.util.Scanner;

public class RemoveDuplicate {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.nextLine();
        String res="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.indexOf(ch)!=str.lastIndexOf(ch)&&res.indexOf(ch)==-1){
                res+=ch;


            }if(ch!=str){

            }
        }


    }
}
