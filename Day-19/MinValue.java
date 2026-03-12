import java.util.Scanner;
public class MinValue {
        public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
    int n = sc.nextInt();
    int min=Integer.MAX_VALUE;
        while (n>0){
        int remaimainder = n%10;
        if (remaimainder<min){
            min=remaimainder;
        }
        n/=10;
    }
        System.out.println(min);

    {
    }
    }
}