package com.company;
import java.util.*;

public class assignment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*int a= sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("The average of the given numbers is: "+avg);
        */

        /*int side = sc.nextInt();
        int area=side*side;
        System.out.println("The area of the square is: "+area);
         */

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float amt = pencil + pen + eraser;
        float tax = 0.18f*amt;
        amt = amt + tax;
        System.out.println("The total amount after adding 18% gst tax on original amount is: "+amt);
    }
}
