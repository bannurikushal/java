package Methods;

import java.util.Scanner;

public class InsertionArray2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size= sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the elements of array:");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        InsertionArray(arr);
        System.out.println("Sorted array:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void InsertionArray(int [] arr){
        for (int i=0;i< arr.length;i++){
            int current=arr[i];
            int prev =i-1;
            while (prev>=0 && current<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;
        }
    }
}
