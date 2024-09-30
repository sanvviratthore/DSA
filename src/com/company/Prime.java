package com.company;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check whether it's prime or not");
        int n=sc.nextInt();
        int div=2;
        if(div<n) {
            if (n % 2 == 0) {
                System.out.println("NOT PRIME");
            } else {
                div = div + 1;
                System.out.println("PRIME");
            }
        }
        else{
            System.out.println("PRIME");
            }
        }
    }

