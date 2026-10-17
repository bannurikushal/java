package Opps;

import java.util.Scanner;

public class StudentIn {
    public static void main(String[] args){
//        Student s1=new Student("nick","btech",18);
//        System.out.println(s1.name+" "+s1.yearOfStudy+" "+s1.age);
//        Student s2=new Student();
//        s2.yearOfStudy="btech2";
//        System.out.println(s2.yearOfStudy);
//        s2.name="nick";
//
        Scanner sc = new Scanner(System.in);
        Student s1=new Student();
        System.out.println("Enter the name:");
        s1.name=sc.nextLine();
        System.out.println("Enter the YearOfStudy:");
        s1.yearOfStudy=sc.nextLine();
        System.out.println("Enter the age:");
        s1.age=sc.nextInt();
        Student s2=new Student();
        System.out.println(s1);
        System.out.println("Enter the name:");
        s2.name=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the YearOfStudy:");
        s2.yearOfStudy=sc.nextLine();
        System.out.println("Enter the age:");
        s2.age=sc.nextInt();
        System.out.println(s2);



    }
}
