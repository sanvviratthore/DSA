package com.company;

public class Backtracking {

    public static void changeArr(int arr[], int i, int val){
        //base case

        if(i== arr.length){
            printArr(arr);
            return;
        }

        //recursion

        arr[i]=val;
        changeArr(arr,i+1,val+1); // function call step
        arr[i]=arr[i]-2; // backtracking step
    }

    public static void findSubsets(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            } else{
                System.out.println(ans);
            }
            return;
        }
        //yes choice
        findSubsets(str,ans+str.charAt(i),i+1);
        //no choice
        findSubsets(str,ans,i+1);
    }

    public static void  printArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void findPermutation(String str, String ans){
        // base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String newStr= str.substring(0,i) + str.substring(i+1);
            findPermutation(newStr,ans+curr);
        }
    }

    public static boolean isSafe(char[][] board, int row, int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0;  i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diag right up
        for(int i=row-1, j=col+1; i>=0 && j< board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

//    public static void nQueens(char[][] board, int row){
//        //base
//        if(row== board.length){
////            printBoard(board);
//            count++;
//            return;
//        }
//
//        //column loop
//        for(int j=0; j< board.length; j++){
//            if(isSafe(board,row,j)) {
//                board[row][j] = 'Q';
//                nQueens(board, row + 1); //function call
//                board[row][j] = 'x'; //backtracking step
//            }
//        }
//    }

    public static boolean nQueens(char[][] board, int row){
        //base
        if(row== board.length){
//            printBoard(board);
            count++;
            return true;
        }

        //column loop
        for(int j=0; j< board.length; j++){
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x'; //backtracking step
            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("---- chessboard ----");
        for(int i=0; i< board.length; i++){
            for(int j=0; j< board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int count=0;
    public static void main(String[] args) {
//        int arr[]=new int[5];
//        changeArr(arr,0,1);
//        printArr(arr);
//        String str="abc";
//        findSubsets(str,"",0);
//        findPermutation("abc","");

        int n=4;
        char board[][] = new char[n][n];
        // initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n ; j++){
                board[i][j]='x';
            }
        }

        if(nQueens(board,0)){
            System.out.println("solution is possible");
            printBoard(board);
         } else{
            System.out.println("solution is not possible");
        }
        //nQueens(board,0);
        //System.out.println("Total ways to solve N-Queens: "+count);
    }
}
