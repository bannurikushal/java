package Strings;

import java.util.Scanner;

public class LeastCharcter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String:");
    String str= sc.nextLine();
    int []arr=new int[255];
    // For traversing
        for (int i=0;i<str.length();i++){
               arr[str.charAt(i)]++;
}
          int Leastcount=Integer.MAX_VALUE;
        char LeastCharcter=' ';
        for (int i=0;i<str.length();i++){
           if(arr[str.charAt(i)]<Leastcount && arr[str.charAt(i)]>0){
            Leastcount=arr[str.charAt(i)];
            LeastCharcter=str.charAt(i);
}
}
        System.out.println(LeastCharcter);
}
}