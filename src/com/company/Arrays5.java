package com.company;

public class Arrays5 {

    public static void maxSubArraySum(int num[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[]=new int[num.length];

        prefixSum[0]=num[0];
        for(int i=1; i< prefixSum.length; i++){
            prefixSum[i]=prefixSum[i-1]+num[i];
        }

        for(int i=0; i< num.length; i++){
            for(int j=i; j< num.length; j++){
                currSum = i == 0? prefixSum[j] : prefixSum[j]-prefixSum[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum= "+maxSum);
    }

    public static int kadanes(int num[]){
        int ms=Integer.MIN_VALUE;
        int sm= Integer.MIN_VALUE;
        int cs=0;

        for(int i=0; i< num.length; i++){
            cs = cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        if(ms==0){
           for(int i=0; i< num.length; i++){
               sm=Math.max(sm,num[i]);
           }
           return sm;
        }
        return ms;
    }

    public static int trappedRainwater(int height[]){
        int n= height.length;
        // calculate left max boundary - array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1; i< n; i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        // calculate right max boundary - array
        int rightMax[]=new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater=0;
        //loop
        for(int i=0; i<n; i++){
            //water level= min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //trapped water= water level- height[i]
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }


    public static void main(String[] args) {

        int num[]={1,2,3,4};
        //int height[]={4,2,0,6,3,2,5};
        //System.out.println(trappedRainwater(height));
        //maxSubArraySum(num);
        System.out.println("Max sum is: "+kadanes(num));
    }
}