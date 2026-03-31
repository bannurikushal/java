import java.util.Scanner;

public class ReverseArray {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the arrray elements:");
        for (int i=0;i< args.length;i++){
            arr[i]= sc.nextInt();
        }
        printReverseArray(arr);
    }
    static void printReverseArray(int[] arr){
        int[] res= new int[arr.length];
        int j=0;
        for(int i= arr.length-1;i>=0;i--){
            res[j]=arr[i];
            j++;
        }
        System.out.println("Reverse array:");
           for (int i=0;i< res.length;i++){
               System.out.println(res[i]);
           }
    }
}
