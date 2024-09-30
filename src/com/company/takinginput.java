package com.company;
import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner s= new Scanner(System.in);
        //System.out.println("Enter first number");
        //boolean b1=s.hasNextInt();
        //System.out.println(b1);
        //int a=s.nextInt();
        /*float a=s.nextFloat();
        System.out.println("Enter second number");
        float b=s.nextFloat();
        float sum=a+b;
        System.out.print("The sum of the given numbers is: ");
        System.out.println(sum);*/
        String st= s.nextLine();
        System.out.println(st);
    }
}
