package com.company;

public class Palindrome {

    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }

        int original=x;
        int rev=0;
        while (x>0){
            int ld=x%10;
            rev=(rev*10)+ld;
            x/=10;
        }
        return original==rev;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
