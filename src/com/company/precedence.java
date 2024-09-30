package com.company;

public class precedence {
    public static void main(String[] args) {
        //int a=6*5-34/2;
        /*
        =30-34/2
        =30-17
        =13
         */
        //int b=60/5-34*2;
        /* Associativity
        =12-34*2
        =12-68
        =-56
        */
        // both * and / has same precedence and left to right associativity
        //System.out.println(a);
        //System.out.println(b);
        int a=1;
        int b=2;
        int c=3;
        int d= ((b*b)-(4*a*c))/(2*a); //() has max prec and ass from left to right
        System.out.println(d);
        int v=2;
        int u=4;
        int x= (v*v)-(u*u);
        System.out.println(x);
    }
}
