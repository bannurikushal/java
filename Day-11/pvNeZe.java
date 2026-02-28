import java.util.Scanner;
public class pvNeZe {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int value= sc.nextInt();
        if(value<0){
            System.out.println("It is is negative");
        } else if (value>0) {
            System.out.println("It is a positive");

        }else {
            System.out.println("it is a zero");
        }
    }
}
