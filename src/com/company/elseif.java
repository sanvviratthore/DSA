package com.company;
import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        /*if(age>50){
            System.out.println("You are experienced");
        }
        else if(age>42){
            System.out.println("You're semi-experienced");
        }
        else if(age>34){
            System.out.println("You're semi-semi-experienced");
        }
        else{
            System.out.println("You're not experienced");
        }
        if(age>=2){
            System.out.println("You're a baby");
        }*/

        switch (age){
            case 18:
                System.out.println("You're going to be an adult");
                break;

            case 23:
                System.out.println("You're going to do a job");
                break;

            case 60:
                System.out.println("You're going to get retired");
                break;

            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my java code!");
    }
}
