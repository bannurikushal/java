import java.util.Scanner;

public class CountsOf1s0s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr [i]= sc.nextInt();
        }
        int zeros=0;
        int ones=0;
        int twos=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==0){
               zeros++;
            }else if (arr[i]==1){
                ones++;
            }else {
                twos++;
            }
        }
        System.out.println(zeros);
        System.out.println(twos);
        System.out.println(twos);
    }
}
