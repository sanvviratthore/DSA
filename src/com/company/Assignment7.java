package com.company;

public class Assignment7 {

    public static int noOfSeven(int arr[][]){
        int count=0;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }

    public static void transpose(int matrix[][]){
        int row= matrix.length, column=matrix[0].length;

        int transpose[][]=new int [column][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }

    //4 7 8
    //8 8 7

    // 4 8
    // 7 8
    // 8 7
    public static void main(String[] args) {
        //int arr[][]={{4,7,8},{8,8,7}};
        int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for(int i=1; i<=1; i++){
            for(int j=0; j<nums[0].length; j++){
                sum+=nums[i][j];
            }
        }
        System.out.println(sum);
        //System.out.println(noOfSeven(arr));
        //transpose(arr);
    }
}
