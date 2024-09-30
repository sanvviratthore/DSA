package com.company;

public class Assignment9 {

    public static void swapNumbers(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        //swapNumbers(5,10);

//        int x=6;
//        System.out.println(x + " + "+ 1 + " is "+ -~x);
//        x=-4;
//        System.out.println(x + " + "+ 1 + " is "+ -~x);
//        x=3;
//        System.out.println(x + " + "+ 1 + " is "+ -~x);

        for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char)(ch | 32)+" ");
        }
    }
}
