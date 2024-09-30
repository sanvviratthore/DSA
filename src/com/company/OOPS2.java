package com.company;

public class OOPS2 {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Sanvi";
        s1.age=20;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2= new Student(s1);
        s2.password="xyz";
        s1.marks[2]=100;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
//        Student s2= new Student("Sanvi");
//        Student s3= new Student(20);
    }
}

class Student{
    String name;
    int age;
    String password;
    int marks[];

    // copy constructor or shallow copy constructor
//    Student(Student s1){
//        marks= new int[3];
//        this.name=s1.name;
//        this.age=s1.age;
//        this.marks=s1.marks;
//    }

    // deep copy constructor
    Student(Student s1){ // we're giving Student constructor a parameter of its own class object
        marks= new int[3];
        this.name=s1.name;
        this.age=s1.age;
        for(int i=0; i< marks.length; i++){
            marks[i]=s1.marks[i];
        }
    }

    // Non-parametrized constructor
    Student(){
        marks= new int[3];
        System.out.println("Constructor is called...");
    }

    // Parametrized Constructors
    Student(String name){
        marks= new int[3];
        this.name=name;
    }
    Student(int age){
        marks= new int[3];
        this.age=age;
    }

}
