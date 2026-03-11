import java.util.Scanner;
public class Palindrome {
    static void main() {


    Scanner sc =new Scanner(System.in);
        System.out.println("Enter a num:");
    int num= sc.nextInt();
    int backup=num;
    int result=0;
        while (num>0){
        int remainder=num%10;
        result=result*10+remainder;
        num/=10;
    }if (backup == result) {
            System.out.println("Plaindrome");
        }else {
            System.out.println("It is not a plaindrome");
        }
    }
}
