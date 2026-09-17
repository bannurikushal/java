package Strings;
import java.util.Scanner;
public class VowelsConsonantsCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        int vowelCont = 0;
        int consonatCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U' || word.charAt(i) == 'a' ||
                    word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                vowelCont++;

            } else {
                consonatCount++;
            }
        }
            System.out.println("vowelCount:" + vowelCont);
            System.out.println("consonantCount" + consonatCount);

    }
}
