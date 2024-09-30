package com.company;

public class Assignment6 {
    public static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int arr[]){
        for(int i= arr.length-2; i>=0; i--){
            for(int j=0; j<=i; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<= arr.length-2; i++){
            int max=i;
            for(int j=i; j< arr.length; j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=0; i< arr.length; i++){
            int j=i;
            while (j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            largest=Math.max(arr[i],largest);
        }

        int count[]=new int[largest+1];
        for(int i=0; i< arr.length; i++){
            count[arr[i]]++; // 0 2 1 2 1 1 1 1 1
        }

        int j=0;
        for(int i= count.length-1 ; i>=0; i--){
            while (count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        countingSort(arr);
        printArray(arr);
    }
}
