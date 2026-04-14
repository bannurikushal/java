package Methods;

import java.util.Scanner;

public class InsertionArray {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of Array");
        int size= sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the elements Array:");
        for (int i=0;i< arr.length-1;i++) {
            arr[i] = sc.nextInt();
        }
        InsertionArray(arr);
        System.out.println("Sort of Array:");
        for (int i=0;i< args.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void InsertionArray(int [] arr){
        for (int i=0;i< arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while (prev<=0&&curr<arr[prev]){
                int temp=arr[prev+1];
                arr[prev+1]=arr[prev];
                arr[prev]=arr[i];
            }
        }
    }
}
