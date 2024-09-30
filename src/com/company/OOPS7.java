package com.company;

public class OOPS7 {
    public static void main(String[] args) { // static because we want only 1 main function
        Student1 s1= new Student1();
        s1.schoolName="MGS";

        Student1 s2= new Student1();
        //System.out.println(s2.schoolName);

        Student1 s3=new Student1();
        s3.schoolName="JVM";
        System.out.println(s2.schoolName);

//        Horse1 h=new Horse1();
//        System.out.println(h.color);
    }
}


class Animal4{
    String color;
    Animal4(){
        System.out.println("animal constructor is called");
    }
}

class Horse1 extends Animal4{
    Horse1(){
        super.color="brown";
        System.out.println("horse constructor is called");
    }
}

class Student1{
    static int returnPercentage(int math, int phy, int chem){

        return (math+phy+chem)/3;
    }
    String name;
    int rollNo;
    static String schoolName;

    void setName(String name){
        this.name=name;
    }
    void setRoll(int rollNo){
        this.rollNo=rollNo;
    }

    String getName(){
        return this.name;
    }
    int getRollNo(){
        return this.rollNo;
    }
}
