import java.util.Scanner;

public class CountDigitsOfNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n = sc.nextInt();
        int count=0;
        while (n>0){
            count++;
            n/=10;

        }
        System.out.println(count);
    }
}
