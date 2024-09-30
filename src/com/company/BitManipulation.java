package com.company;

public class BitManipulation {

    public static void oddOrEven(int num){
       int bitMask=1;
       if((num & bitMask)==0){
           System.out.println("Even number");
       }
       else if((num & bitMask)==1){
           System.out.println("Odd number");
       }
    }

    public static int getithBit(int n, int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setithBit(int n, int i){
        int bitMask=1<<i;
        return n | bitMask;
    }

    public static int clearithBit(int n, int i){
        int bitMask= ~(1<<i);
        return n & bitMask;
    }

    public static int updateithBit(int n, int i, int newBit){
//        if(newBit == 0){
//            return clearithBit(n,i);
//        }
//        else{
//            return setithBit(n,i);
//        }

        n = clearithBit(n,i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int cleariBits(int n, int i){
        int bitMask= (~0)<<i;
        return n & bitMask;
    }

    public static int cleariBitsRange(int n, int i,int j){
       int a=((~0)<<(j+1));
       int b=(1<<i)-1;
       int bitMask=a | b;
       return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n){
        while(n>0) {
            return (n & (n-1)) == 0;
        }
        return false;
    }

    public static int countSetBits(int n){
//        int count=0;
//        while (n>0){
//            if((n & 1)!=0){
//                count++;
//            }
//            n=n>>1;
//        }
//        return count;
        return Integer.bitCount(n);
    }

    public static double fastExpo(double a, int n){
       double ans=1;
       long absN=n;

       if(n<0){
           absN=-absN;
           a=1/a;
       }

       while (absN>0){
           if((absN & 1) !=0){
               ans=ans*a;
           }
           a=a*a;
           absN=absN>>1;
       }
       return ans;
    }

    public static long modularExpo(long x, long n, long m){
        long ans=1;
        x=x%m;

        while (n>0){
            if((n & 1)!=0){
                ans=(ans*x) % m;
            }
            x=(x*x) % m;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(5 & 6);
//        System.out.println(5 | 6);
//        System.out.println(5 ^ 6);
//        System.out.println(~5);
//        System.out.println(~0);
//        System.out.println(5<<2);
//        System.out.println(6>>1);
//        oddOrEven(3);
//        oddOrEven(14);
        //System.out.println(getithBit(10,2));
        //System.out.println(setithBit(10,2));
        //System.out.println(clearithBit(10,1));
        //System.out.println(updateithBit(10,2,1));
        //System.out.println(cleariBits(15,2));
        //System.out.println(cleariBitsRange(10,2,4));
        //System.out.println(isPowerOfTwo(0));
        //System.out.println(countSetBits(10));
        //System.out.println(fastExpo(2.00000,-2));
        System.out.println(modularExpo(368197359,236379235,386345442));
    }
}
