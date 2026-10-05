package Strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String:");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String res = "";

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            String reversedWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            res += reversedWord + " ";
        }

        System.out.println(res.trim());
        sc.close();
    }
}
