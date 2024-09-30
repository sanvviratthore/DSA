package com.company;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        //for(int i=1; i<=10; i++){
        //    System.out.println(i);
        //}

        //quick quiz

        //2n=Even number=2,4,6,8
        //2n+1=Odd number=3,5,7,9

        //Scanner sc=new Scanner(System.in);

        //System.out.println("Enter a number");
        //int n= sc.nextInt();
        //for(int i=1; i<=n; i++){
         //   System.out.println(2*i+1);
       // }

        //for(int i=5; i!=0; i--){
          //  System.out.println(i);
        //}

        //quick quiz
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        for(int i=n; i>0; i--){
            System.out.println(i);
        }
    }
}
