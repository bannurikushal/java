import java.util.Scanner;
public class SumOfNnumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //sum=sum+i//
            sum += i;
        }
        System.out.println(sum);
    }
}
