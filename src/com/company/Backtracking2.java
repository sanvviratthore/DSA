package com.company;

import javax.swing.*;

public class Backtracking2 {

    public static int gridWays(int i, int j, int n, int m){

        //base case
        if(i==n-1 && j==m-1){ //condn for last cell
            return 1;
        } else if(i==n || j==n){ //boundary cross condn
             return 0;
        }
        int w1 = gridWays(i+1,j,n,m);
        int w2 = gridWays(i,j+1,n,m);
        return w1+w2;
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        // column
        for(int i=0; i<=8; i++){
            if(sudoku[i][col]== digit){
                return false;
            }
        }

        //row
        for(int j=0; j<=8; j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        // 3x3 grid
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        // base case
        if(row==9){
            return true;
        }

        //recursion
        int nextRow=row, nextCol=col+1;
        if(col+1 == 9){
            nextRow=row+1;
            nextCol=0;
        }

        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku,nextRow,nextCol);
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku,nextRow,nextCol)){ //sol exists
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0; i<9 ; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int n=3, m=3;
//        System.out.println(gridWays(0,0,n,m));
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
                {4,9,0,1,5,7,0,0,2},
                {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}};

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("solution exists");
            printSudoku(sudoku);
        } else{
            System.out.println("solution does not exists");
        }
    }
}