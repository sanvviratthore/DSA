package com.company;
import java.util.Scanner;

public class fail {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in EVS: ");
        int a=sc.nextInt();
        System.out.println("Enter your marks in PHYSICS: ");
        int b=sc.nextInt();
        System.out.println("Enter your marks in MATHS: ");
        int c=sc.nextInt();
        int d=a+b+c;
        float perc=(d/300.0f)*100;
        System.out.println("Your total percentage is: "+perc);
        if(a>=33 && b>=33 && c>=33 && perc>=40){
            System.out.println("You're pass!");
        }
        else{
            System.out.println("You're fail.");
        }
    }

}
