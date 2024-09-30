package com.company;

public class logical {
    public static void main(String[] args) {
        System.out.println("For logical AND...");
        boolean a=true;
        boolean b=true;
        boolean c=true;
        if(a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For logical OR...");
        boolean a1=false;
        boolean b1=false;
        if(a1 || b1){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For logical NOT...");
        System.out.print("Negation of a is: ");
        System.out.println(!a);
        System.out.print("Negation of b is: ");
        System.out.println(!b);
    }
}
