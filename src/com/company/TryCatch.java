package com.company;

public class TryCatch {
    public static void main(String[] args) {
        try{
            int arr[]={1,2,3,4};
            System.out.println(arr[3]);
        }
        catch (Exception e){
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}