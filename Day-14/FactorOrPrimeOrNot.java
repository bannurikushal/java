import java.util.Scanner;
public class FactorOrPrimeOrNot {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        int factor_count=0;
        int prime_count=0;
        if (n>1){


        for (int i=1;i<=n;i++) {
            if (n % i == 0) {
                factor_count++;
            }
        }
            System.out.println("Factor Count is:"+factor_count);
        if (prime_count==2) {
            System.out.println("It is a prime");
        }else{
            System.out.println("It is not a prime");
        }
        }else {
            System.out.println("Number should be Grater than One");
        }
    }
}
