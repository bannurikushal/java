import java.util.Scanner;

public class PrintEvenNums {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
