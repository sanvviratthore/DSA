package com.company;

import org.w3c.dom.ls.LSOutput;

public class Assignment4 {

    public  static int average(int a, int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean palindrome(int n){
        int myNum=n;
        int rev=0;
        while (n>0){
            int lastDigit=n%10;
            rev = rev*10+lastDigit;
            n=n/10;
        }
        if(myNum==rev){
            return true;
        }
        else{
            return false;
        }
    }


    public static int sumOfDigits(int n){
        int sum=0;
        while (n>0) {
            int lastDigit=n%10;
            sum+=lastDigit;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits of the number is: "+sumOfDigits(1425));
    }
    /*public static void main(String[] args) {
        float a=12.0f;
        float b =7.4f;
        System.out.println("Minimun of 12 and 7.4 is: "+Math.min(a,b));
        System.out.println("Maximum of 12 and 7.4 is: "+Math.max(a,b));
        System.out.println("Square root of 12: "+Math.sqrt(a));
        System.out.println("Value of 12 to the power 7.4 is: "+Math.pow(a,b));
        System.out.println("Absolute value of 7.4 is: "+(int)Math.abs(b));

    }

     */
}
