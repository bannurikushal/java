import java.util.Scanner;

public class FactorialWhile {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n = sc.nextInt();
        int factorial=1;
        int i=1;
        while (i<=n){

            factorial=factorial*i;
            i++;

        }
        System.out.println(factorial);

    }
}
