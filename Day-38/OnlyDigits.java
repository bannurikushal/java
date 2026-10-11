package Strings;

import java.util.Scanner;

public class OnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        boolean onlyDigit = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                onlyDigit = false;
                break;
            }
        }
        if (onlyDigit) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
