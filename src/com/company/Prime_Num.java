package com.company;
import java.util.*;

public class Prime_Num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("n is not a prime number");
        }
        else{
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n) ; i++){
                if(n%i == 0){ // n is divisible by i (i is not equal to 1 or n)
                    isPrime=false;
                }
                else {
                    isPrime=true;
                }
            }
            if(isPrime=true){
                System.out.println("n is a prime number");
            }
            else{
                System.out.println("n is not a prime number");
            }
        }
    }
}
