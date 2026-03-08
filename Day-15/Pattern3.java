import java.util.Scanner;
public class Pattern3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
