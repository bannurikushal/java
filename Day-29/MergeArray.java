package Methods;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array1:");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter a size of array2:");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = sc.nextInt();
        }
        mergeArray(arr1, arr2);
    }

    static void mergeArray(int[] arr1, int[] arr2) {
        int[] output = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i > arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                output[k] = arr1[i];
                i++;
                k++;
            } else {
                output[k] = arr2[j];
                j++;
                k++;
            }
            while (j < arr2.length) {
                output[k] = arr2[j];
                k++;
                j++;
            }
            while (i < arr1.length) {
                output[k] = arr1[i];
                i++;
                k++;
            }
        }
        System.out.println("Merge of Array:");
        for (k = 0; k < output.length; k++) {
            System.out.println(k);
        }
    }
}


