package Opps;

public class Student {
    String name;
    String yearOfStudy;
    int age;
    Student(){
        System.out.println("Inside default constructor");
    }
    Student(String name,String yearOfStudy,int age){
        this.name=name;
        this.yearOfStudy=yearOfStudy;
        this.age=age;


    }
}
