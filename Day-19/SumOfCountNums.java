import java.util.Scanner;

public class SumOfCountNums {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n= sc.nextInt();
        int sum=0;
        while (n>0){
            int remainder=n%10;
            sum+=remainder;
            n/=10;
        }
        System.out.println(sum);
    }
}
