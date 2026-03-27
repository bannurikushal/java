import java.util.Scanner;

public class LinearSearch {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size of array");
        int size= sc.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[size];
        for (int i=0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a element to be Search:");
        int target=sc.nextInt();
        boolean elementFound = false;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                System.out.println(i);
                elementFound = true;
                break;

            } if (!elementFound) {
                System.out.println("-1");
            }

            }
        }
    }

