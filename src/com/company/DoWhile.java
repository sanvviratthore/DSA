package com.company;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int b=10;
        do{
            System.out.println(b);
            b++;
        }while (b<5);

        //quick quiz
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int a=1;
        do{
            System.out.println(a);
            a++;
        }while (a<=n);
    }
}
