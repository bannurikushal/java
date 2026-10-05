package Strings;

import java.util.Scanner;

public class ReverseingWord {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str= sc.nextLine();
        String[] arr=str.split(" ");
        String res="";
        int left=0;
        int right=arr.length-1;
        while (left<right){
            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for (int i=0;i<arr.length;i++){
            res+=arr[i]+"";
        }
        System.out.println(res.trim());
    }
}
