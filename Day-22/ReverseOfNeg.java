import java.util.Scanner;
public class ReverseOfNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = sc.nextInt();
        if(num>0) {
            num = Math.abs(num);
        }
        int result = 0;
        while (num > 0) {
            int remainder = num% 10;
            result = result * 10 + remainder;
            num /= 10;
        }
        if (num < 0) {
            System.out.println(result + "-");
        } else {
            System.out.println(result);
        }
        }

        }

