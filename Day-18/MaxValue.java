import java.util.Scanner;

public class MaxValue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n = sc.nextInt();
        int max=Integer.MIN_VALUE;
        while (n>0){
            int remaimainder = n%10;
            if (remaimainder>max){
                max=remaimainder;
            }
            n/=10;
        }
        System.out.println(max);

    }
}
