package com.company;

import java.util.Scanner;

public class TwoDArrays {

    public static boolean search(int matrix[][],int key){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("Value found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void sorm(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                /*if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];

                }*/
                smallest = Math.min(smallest,matrix[i][j]);
                /*if(matrix[i][j]>largest){
                    largest=matrix[i][j];

                }*/
                largest=Math.max(largest,matrix[i][j]);
            }
        }
        System.out.println("Smallest element is: "+smallest);
        System.out.println("Largest element is: "+largest);
    }
    public static void main(String[] args) {
//        int matrix[][] = new int[2][2];
//        int n= matrix.length, m= matrix[0].length;
//
//        Scanner sc=new Scanner(System.in);
//        for(int i=0; i<n; i++){ // for no of rows
//            for(int j=0; j<m; j++){ //for no of columns
//               matrix[i][j]= sc.nextInt();
//            }
//        }
//
//        // output
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//        //search(matrix,5);
//        sorm(matrix);

        int matrix[][]=new int[3][4];
        Scanner sc = new Scanner(System.in);

        int n= matrix.length;
        int m=matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("Input the value of "+i+","+j+" cell: ");
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("The 2D Arrays is: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
