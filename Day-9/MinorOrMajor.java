import java.util.Scanner;
public class MinorOrMajor {
    static void main() {



        System.out.println("Enter Your Age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age <= 18){
            System.out.println("Your are a minor");
        }
        else {
            System.out.println("Your are a major");
        }
    }
}
