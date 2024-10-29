package com.company;

public class RecursionAdv {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currentChar=str.charAt(idx);
        if(map[currentChar-'a'] == true){
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currentChar-'a']= true;
            removeDuplicates(str, idx+1, newStr.append(currentChar),map);
        }

    }

    public static int tiling(int n){
        // base case
        if(n==0 || n==1) {
            return 1;
        }
        return tiling(n-1)+tiling(n-2);
    }

    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }

    public static void printBinStrings(int n, int lastPlace, String str){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }

        printBinStrings(n-1, 0, str+"0");
        if(lastPlace==0){
            printBinStrings(n-1,1,str+"1");
        }
    }

    public static void main(String[] args) {
        System.out.println(tiling(3));
        //String str="appnnacollege";
        //removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);
        //System.out.println(friendsPairing(4));
       // printBinStrings(3,0,"");
    }
}
