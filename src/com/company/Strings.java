package com.company;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //String name= new String("Sanvi"); //String in java is a class itself and can be used as a primitive data type
        //String name="Sanvi";
        //System.out.println(name);
        int a=6;
        float b=5.6765f;
        System.out.printf("The value of a is %d and b is %4.2f",a,b);
        //System.out.format("The value of a is %d and b is %f",a,b);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s= sc.nextLine();
        System.out.println(s);
    }
}
