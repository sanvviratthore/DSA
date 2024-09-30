package com.company;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void printArray(Integer arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer array[]={6,1,3,8,2};
        //Array.sort(array,si,ei)
        //this sort helps sort the array in ascending order

        //Arrays.sort(array,0,2);

        Arrays.sort(array,0,3,Collections.reverseOrder()); // for this we've to convert the int type to Integer Class
        printArray(array);
    }
}
