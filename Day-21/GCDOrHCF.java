import java.util.Scanner;

public class GCDOrHCF {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num1:");
        int num1= sc.nextInt();
        System.out.println("Enter a num2");
        int num2= sc.nextInt();
        int a=Math.max(num1,num2);
        int b=Math.min(num1,num2);
        while (b!=0){
            int remaider=a%b;
            a=b;
            b=remaider;
        }
        System.out.println(a);
    }
}
