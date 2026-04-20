import java.util.Scanner;

public class AssinOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size = sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter elements of Array:");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
            System.out.println(arr[i]);
        }
    }
}
