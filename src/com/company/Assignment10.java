package com.company;

public class Assignment10 {

    public static void key(int arr[], int i, int key){
        if(i == arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }

        key(arr,i+1,key);
    }

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void year(int num){
        if(num==0){
            return;
        }
        int ld=num%10;
        year(num/10);
        System.out.print(digits[ld]+" ");
    }

    public static void main(String[] args) {
//        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
//        key(arr,0,2);
        year(2019);
    }
}
