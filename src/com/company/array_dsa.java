package com.company;

public class array_dsa {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
    int[] myArray= new int[5]; //deafault values //0 1 2 3 4
    //printArray(myArray);
        myArray[0]=1;
        myArray[1]=4;
        myArray[2]=5;
        myArray[3]=3;
        myArray[4]=7;
        myArray[3]=5;
        printArray(myArray);
       // myArray[5]=47;
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length -1]);
        int[] arr={2,5,6,7};
        printArray(arr);
    }

    public static void main(String[]args) {
        array_dsa arrayUtil = new array_dsa();
        arrayUtil.arrayDemo();
    }

}




