package com.company;

import java.util.ArrayList;

public class Arrays6 {

    public static int buyAndSellStocks(int prices[]){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(buyPrice<prices[i]){ // profit
                int profit = prices[i]-buyPrice; //today's profit
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }

    public static int containerWithMostWater(int height[]){
        int max=0;
        int left=0;
        int right= height.length-1;

        while(left<=right){
            int area=0;
            int breadth=Math.abs(left-right);
            int length=Math.min(height[left],height[right]);
            area=length*breadth;
            max=Math.max(area,max);
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {

        int prices[]={7,1,5,3,6,4};
        int height[]={1,8,6,2};
        System.out.println(containerWithMostWater(height));
       // System.out.println("Your maximum profit is: "+buyAndSellStocks(prices));
    }
}