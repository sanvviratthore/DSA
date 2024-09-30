package com.company;

public class Arrays3 {
    public static int binarySearch(int numbers[],int key){
      int start=0, end = numbers.length-1;

      while (start<=end){
           int mid =(start+end)/2;
           if(numbers[mid] == key){
               return mid;
           }
           else if(numbers[mid]>key){ // left
               end = mid-1;
           }else{
               start=mid+1;
           }
      }
      return -1;
    }

    public static void reverse(int numbers[]){
        int first=0, last= numbers.length-1;

        while (first<last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
//         int numbers[]= {2,3,45,57,20};
//         int key=57;
//
//        System.out.println("Key found at: "+binarySearch(numbers,key));
        int numbers[]={1,3,5,7,9};

        reverse(numbers);
        for (int i=0; i< numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
