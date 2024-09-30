package com.company;

public class TimeComplexityDemo_dsa {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        TimeComplexityDemo_dsa demo=new TimeComplexityDemo_dsa();
        System.out.println(demo.findSum(99999));
        System.out.println("Current time is: " + (System.currentTimeMillis() - now) + "Millisecs");
    }

    public int findSum(int n){
        return n*(n+1)/2;
    }

    /*public int findSum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum=sum+i;
        }
        return sum;
    }*/
}
