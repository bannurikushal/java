import java.util.Scanner;
public class TriangelsTypes {
    static void main() {


    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a side value:");
        int a= sc.nextInt();
        System.out.println("Enter b side value:");
        int b= sc.nextInt();
        System.out.println("Enter c side value:");
        int c= sc.nextInt();
        if (a==b&&b==c&&c==a){
            System.out.println("It is a equilateral");
        } else if (a==b&&c!=a) {
            System.out.println("it is a isolateral");

        } else if (b==c&&b!=a) {
            System.out.println("it is a isolateral");

        } else if (c==a&&c!=b) {
            System.out.println("it is a isolateral");
        }else {
            System.out.println("it is a scaler");
        }
    }
}
