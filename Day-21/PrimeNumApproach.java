import java.util.Scanner;

public class PrimeNumApproach {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int n= sc.nextInt();
        int factorcount=0;
        for (int i=2;i<n;i++){
            if (n%i==0){
                factorcount++;
            }
            }
        if (factorcount==0){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
        }
    }

