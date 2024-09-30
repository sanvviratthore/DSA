package com.company;
import java.util.Scanner;

public class cbse {
    public static void main(String[] args) {
        System.out.println("Please enter the details given below");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter marks in maths:");
        float a=s.nextFloat();
        System.out.println("Enter marks in physics");
        float b=s.nextFloat();
        System.out.println("Enter marks in chemistry");
        float c=s.nextFloat();
        System.out.println("Enter marks in cs");
        float d=s.nextFloat();
        System.out.println("Enter marks in em:");
        float e=s.nextFloat();
        float sum=a+b+c+d+e;
        float perc=(sum/500)*100;
        System.out.printf("You acquired %f",perc);
    }
}