package com.company;

public class Recursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int calSum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = calSum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fibn = fnm2 + fnm1;
        return fibn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length-1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }

    public static int optimizedPow(int a, int n){
        if(n==0){
            return 1;
        }

        int halfPower=optimizedPow(a,n/2);
        int halfPowerSq=halfPower*halfPower;

        // n is odd
        if(n%2!=0){
            halfPowerSq=a*halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        //int n=5;
        //printInc(n);
//        System.out.println(fact(n));
        //System.out.println(calSum(n));
        //System.out.println(fib(5));
        int arr[]={1,2,3,4,3,6};
        //System.out.println(isSorted(arr,0));
        System.out.println(firstOccurence(arr,7,0));
        //System.out.println(lastOccurence(arr,3,0));\
        //System.out.println(pow(2, 10));
        //System.out.println(optimizedPow(2,5));
    }
}