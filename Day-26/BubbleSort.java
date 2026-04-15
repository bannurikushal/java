package Methods;

import java.util.Scanner;

public class BubbleSort {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size= sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements of Array:");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        BubbleSort(arr);
        System.out.println("Reverse of array:");
        for (int i=0;i< arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
        static void BubbleSort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;i< arr.length-(i+1);j++){
               if (arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }


            }
        }
    }
}

