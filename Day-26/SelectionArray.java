package Methods;

import java.util.Scanner;

public class SelectionArray {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size Array:");
        int size = sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements of Array:");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        SortArray(arr);
        for (int i=0;i< arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void SortArray(int [] arr){
        for (int i=0;i< arr.length-1;i++){
            int minIndex=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
