package com.company;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num>=0){
            System.out.println("Entered number is positive!");
        }
        else {
            System.out.println("Entered number is negative!");
        }

         */

        /*double temp = 103.5;
        if(temp>=100){
            System.out.println("You've a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }

         */
        Scanner sc= new Scanner(System.in);
        /*System.out.println("Enter a number(1-7) to find which day of the week it is");
        int weekday = sc.nextInt();
        switch (weekday){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter a valid weekday");
        }

         */
        System.out.println("Enter a year to check whether it's leap year or not");
        int year = sc.nextInt();
        if(year%4==0 && year%100==0 && year%400==0){
            System.out.println("Entered year is a leap year");
        } else if(year%4==0 && year%100!=0){
            System.out.println("Entered year is a leap year");
        } else{
            System.out.println("Entered year isn't a leap year");
        }

    }
}
