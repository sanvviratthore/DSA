package com.company;
import java.util.*;

public class Function {

   /* public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        printHelloWorld(); //calling the function
    }

    */

   /* public static int calculateSum(int num1,int num2){ // formal parameter or parameters
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum= calculateSum(a,b); //this sum and that sum are different
        System.out.println("The sum is: "+sum); // here a and b are actual parameters or arguments
    }

    */

    // call by value
    /*public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }

    public static void main(String[] args) {
        int a= 5;
        int b= 10;
        swap(a,b);
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
    }

     */

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    /*public static void main(String[] args) {
        int a=5;
        int b=5;
        int prod= multiply(a,b);
        System.out.println("a x b is: "+prod);
        prod = multiply(2,4);
        System.out.println("a x b is: "+prod);
    }

     */

    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++) {
            f=f*i;
        }
        return f;
    }


    // nCr = n!/r! x (n-r)!
    public static int binCoeff(int n, int r){
       int  fact_n = factorial(n);
       int fact_r = factorial(r);
       int fact_nmr = factorial(n-r);

       int binCoeff = fact_n/(fact_r*fact_nmr);
       return binCoeff;
    }


    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }


    public static int sum1(int a, int b){
        return a+b;
    }

    public static float sum1(float a, float b){
        return a+b;

    }



    public static boolean isPrime(int n){
        // corner cases
        if(n==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){ //true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primesInRange(16);
    }


}
