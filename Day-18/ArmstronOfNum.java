import java.util.Scanner;
public class ArmstronOfNum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num:");
        int num = sc.nextInt();
        int backup = num;
        int result = 0;

        while (num > 0) {
            int remainder = num % 10;
            result = result + (remainder * remainder * remainder);
            num /= 10;
        }

        if (result == backup) {
            System.out.println("It is a Armstrong");
        } else {
            System.out.println("It is not a Armstrong");
        }
    }
}


