import java.util.Scanner;
public class BiggervalueInMulValues {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a= sc.nextInt();
        System.out.println("Enter b value:");
        int b= sc.nextInt();
        System.out.println("Enter c value:");
        int c= sc.nextInt();
        if (a>b && a>c){
            System.out.println("a is bigger value");
        } else if (b>a && b>c) {
            System.out.println("b is bigger value");

        } else if (c>a && c>b) {
            System.out.println("c is bigger value");

        } else if (a==b && a!=c) {
            System.out.println("a and b are equal");

        } else if (b==c && b!=a) {
            System.out.println("b and c are equal");

        } else if (c==a && c!=b) {
            System.out.println("c and a are equal");

        }else {
            System.out.println("all values are equal");
        }
    }
}
