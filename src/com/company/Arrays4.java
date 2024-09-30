package com.company;

public class Arrays4 {
    public static void pairs(int numbers[]){
        int tp=0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j< numbers.length; j++){
                System.out.print(" ("+ curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs: "+tp);
    }

    public static void subarrays(int numbers[]){
        int ts=0;
        //int sum=0;
        for(int i=0; i< numbers.length; i++){
            for(int j=i; j< numbers.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                   // sum+=numbers[k];
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays: "+ts);
       // System.out.println(sum);
    }

    public static void sumSubarrays(int num[]){
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;

        for(int i=0; i< num.length; i++){
            for(int j=i; j< num.length; j++){
                currSum=0;
                for(int k=i; k<=j; k++){
                    currSum+=num[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum= "+maxSum);
    }

    public static void main(String[] args) {

       int numbers[]={2,3,4};
       //subarrays(numbers);
       pairs(numbers);
        //sumSubarrays(numbers);
    }
}