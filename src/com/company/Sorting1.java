package com.company;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorting1 {
//    public static void bubbleSort(int num[]){
//        for(int turn=0; turn< num.length-1; turn++){
//
//            for(int j=0; j< num.length-1-turn; j++){
//                if(num[j]>num[j+1]) {
//                    int temp = num[j];
//                    num[j] = num[j + 1];
//                    num[j + 1] = temp;
//
//                }
//            }
//        }
//        for(int i=0; i< num.length; i++){
//            System.out.print(num[i]+" ");
//        }
//        System.out.println();
//
//    }

 public static void bubbleSort(int arr[]){
     for(int i= arr.length-2; i>=0; i--){
         for(int j=0; j<=i; j++){
             if(arr[j]>arr[j+1]){
                 int temp=arr[j+1];
                 arr[j+1]=arr[j];
                 arr[j]=temp;
             }
         }
     }
 }

 // optimized with tc as O(n)
 public static void modifiedBubbleSort(int arr[]){
     for(int i=0; i<arr.length; i++){
         boolean swapped= false;
         for(int j=0; j< arr.length-1-i; j++){
             if(arr[j]>arr[j+1]) {
                 int temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;
                 swapped = true;
             }
         }
         if(swapped==false){
             break;
         }
     }
 }


//    public static void selectionSort(int arr[]){
//        for(int i=0; i< arr.length-1; i++){
//            int minPos=i;
//            for(int j=i+1; j< arr.length; j++){
//                if(arr[minPos]>arr[j]){
//                    minPos=j;
//                }
//            }
//            int temp=arr[minPos];
//            arr[minPos]=arr[i];
//            arr[i]=temp;
//        }
//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }


  public static void selectionSort(int arr[]){
     for(int i=0 ;  i<= arr.length-2; i++){
         int min=i;
         for(int j=i; j< arr.length; j++){
             if(arr[j]<arr[min]){
                 min=j;
             }
         }
         int temp=arr[min];
         arr[min]=arr[i];
         arr[i]=temp;
     }
  }
//    public static void insertionSort(int num[]){
//        for(int i=1; i< num.length; i++){
//            int curr= num[i];
//            int prev = i-1;
//            // finding out the correct pos to insert
//            while (prev>=0 && num[prev]>curr){
//                num[prev+1]=num[prev];
//                prev--;
//            }
//            // insertion
//            num[prev+1] = curr;
//        }
//        for(int i=0; i< num.length; i++){
//            System.out.print(num[i]+" ");
//        }
//        System.out.println();
//    }

   public static void insertionSort(int arr[]){
     for(int i=0; i< arr.length; i++){
         int j=i;
         while (j>0 && arr[j-1]>arr[j]){
             int temp=arr[j];
             arr[j]=arr[j-1];
             arr[j-1]=temp;
             j--;
         }
     }
   }

//    public static void countingSort(int arr[]){
//     int largest=Integer.MIN_VALUE;
//     for(int i=0; i< arr.length; i++){
//         largest=Math.max(largest,arr[i]);
//     }
//
//     // counting frequency
//     int count[]= new int[largest+1];
//     for(int i=0; i< arr.length; i++){
//         count[arr[i]]++;
//     }
//
//     // sorting
//     int j=0;
//     for(int i=0; i< count.length; i++){
//         while (count[i]>0){
//             arr[j]=i;
//             j++;
//             count[i]--;
//         }
//     }
// }

    public static void countingSort(int arr[]){
     int largest=Integer.MIN_VALUE;
     int smallest=Integer.MAX_VALUE; // 2 0 -1 1

     for(int i=0; i<arr.length; i++){
         largest=Math.max(largest,arr[i]);
         smallest=Math.min(smallest,arr[i]);
     }

     // frequency array
     int count[]=new int[largest-smallest+1];
     for(int i=0; i< arr.length; i++){
         count[arr[i]-smallest]++;
     }

     // modifying the original array
     int j=0;
     for(int i=0; i< count.length; i++){
         while(count[i]>0){
             arr[j]=i+smallest;
             j++;
             count[i]--;
         }
      }
    }

    public static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // int --> primitive data type
    // Integer --> Class
    public static void main(String[] args) {

        int num[]={5,3,1,-3,-2,-1,4,6};
        //bubbleSort(num);
        //selectionSort(num);
        //insertionSort(num);
        //Arrays.sort(num,0,3);
        //Arrays.sort(num, Collections.reverseOrder());
        //Arrays.sort(num,0,3, Collections.reverseOrder());
        //countingSort(num);
        modifiedBubbleSort(num);
        printArray(num);
    }
}