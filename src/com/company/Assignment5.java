package com.company;

public class Assignment5 {

    public static boolean appearance(int num[]){
        for(int i=0; i< num.length; i++){
            for(int j=i+1; j< num.length; j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int binarySearch(int num[],int key){
        int start=0, end= num.length-1;

        for(int i=0; i< num.length; i++){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static int buyAndSellStocks(int prices[]){
        int maxProfit = 0;
        int buyPrice=Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
            else {
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }

    public static int trappedWater(int height[]){
        int n= height.length;;

        //Left max Boundary
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1; i<n; i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        //Right max Boundary
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1] );
        }

        int trappedWater=0;
        for(int i=0; i<n; i++){
            int waterLevel=Math.min(rightmax[i],leftmax[i] );
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,1};
        int prices[]={7,6,5,1,4,5,6};
        int height[] ={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        //System.out.println(appearance(num));
        //System.out.println(binarySearch(num,2));
        //System.out.println(buyAndSellStocks(prices));
        System.out.println(trappedWater(height));
    }
}
