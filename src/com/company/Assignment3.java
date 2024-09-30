package com.company;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*System.out.println("Enter a number");
        int n = sc.nextInt();
        int fact = 1;

        for(int i =1 ; i<=n ; i++){
            fact*=i;

        }
        System.out.println("The factorial of the number is: "+fact);
         */

        /*int a = sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        int d = sc.nextInt();

        int sume=0;
        int sumo=0;

        if(a%2==0) sume+=a;
        if(b%2==0) sume+=b;
        if(c%2==0) sume+=c;
        if(d%2==0) sume+=d;

        if(a%2!=0) sumo+=a;
        if(b%2!=0) sumo+=b;
        if(c%2!=0) sumo+=c;
        if(d%2!=0) sumo+=d;

        System.out.println(sume);
        System.out.println(sumo);
         */

       /* System.out.println("Enter a number");
        int n= sc.nextInt();
        for(int i=1; i<=10 ; i++){
            System.out.printf("%d X %d = %d %n",n,i,n*i);
        }

        */

        int num;
        int ch;
        int sume=0;
        int sumo=0;

        do{
            System.out.println("Enter a number");
            num= sc.nextInt();

            if(num%2==0){
                sume+=num;
            }
            else{
                sumo+=num;
            }

            System.out.println("Do you want to continue? if yes press 1 or press 0");
            ch=sc.nextInt();


        }while (ch==1);


        System.out.println("Sum of even numbers: "+sume);
        System.out.println("Sum of odd numbers: "+sumo);
    }
}
