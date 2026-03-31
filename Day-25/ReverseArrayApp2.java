import java.util.Scanner;

public class ReverseArrayApp2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the arrray elements:");
        for (int i = 0; i < args.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
    }
    static void reverseArray(int[] arr){
        int left=0;
        int right= arr.length-1;
        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

}
