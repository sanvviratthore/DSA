package com.company;
import java.util.Scanner;

public class website {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a website link");
        String website=sc.next();
        if(website.endsWith(".com")){
            System.out.println("It's a commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("It's an indian website");
        }
        else if(website.endsWith(".org")){
            System.out.println("It's an organisational website");
        }
    }
}
