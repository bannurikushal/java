import java.util.Scanner;
public class Pattern6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num:");
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
