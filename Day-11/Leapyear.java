import java.util.Scanner;
public class Leapyear {
    static void main() {


    Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int year= sc.nextInt();
                if(year % 4==0 && year% 400 ==0){
                    System.out.println("it is leap year");
                }else {
                    System.out.println("it is not leap year");
                }
}
}
