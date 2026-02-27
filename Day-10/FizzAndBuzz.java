import java.util.Scanner;
public class FizzAndBuzz {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int value= sc.nextInt();
        if(value%3==0 && value%5==0){
            System.out.println("Fizz and Buzz");
        } else if (value%3==0) {
            System.out.println("Fizz");
        } else if (value%5==0) {
            System.out.println("Buzz");
        }else {
            System.out.println("it is not Fizz and Buzz");
        }
    }
}
