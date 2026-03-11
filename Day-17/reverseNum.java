import java.util.Scanner;
public class reverseNum {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a num:");
        int num= sc.nextInt();
        int result=0;
        while (num>0){
            int remainder=num%10;
            result=result*10+remainder;
            num/=10;
        }
        System.out.println("Reverse num:"+result);
    }
}
