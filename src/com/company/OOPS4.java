package com.company; // user defined packages
import java.util.*; // utility package --> inbuilt package

public class OOPS4 {
    public static void main(String[] args) {
//        Calculator calc=new Calculator();
//        System.out.println(calc.sum(1,2));
//        System.out.println(calc.sum(2.5f,5.7f));
//        System.out.println(calc.sum(1,2,3));

        Deer d= new Deer();
        d.eat();
    }
}

class Animal1{
    void eat(){
        System.out.println("Eats anything.");
    }
}

class Deer extends Animal1{
    void eat(){
        System.out.println("Eats grass!");
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}