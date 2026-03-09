import java.util.Scanner;
public class Pattern5 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int n= sc.nextInt();
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
