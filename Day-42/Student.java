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
    Student(String yearOfStudy,String name){   // we can't assign same Data types multiple times

    }
//    Student(String name,String yearOfStudy){
//
//    }

}
