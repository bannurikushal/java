import java.util.Scanner;

public class PrintPrime1toN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n= sc.nextInt();
        int primecount=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<n;j++){

                if (n%j==0) {
                    primecount++;
                }if (primecount==2){
                    System.out.println(j);
                }
            }

        }
    }
}
