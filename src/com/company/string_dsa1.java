package com.company;
import java.util.*;
public class string_dsa1 {

    public static void printLetters(String str){ // Sanvi
       for(int i=0; i<str.length(); i++){ //0 1 2 3 4 5
           System.out.print(str.charAt(i)+" "); //S a n v i
       }
        System.out.println(); // array[i] || str.charAt(i)
    }

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str1= "1223 abs d %$$#@";
        String str2= new String("abcd");

        // Strings are IMMUTABLE
        Scanner sc=new Scanner(System.in); // I am Sanvi
        String name=sc.nextLine();
        System.out.println(name);

//        String fullName="Sanvi Rathore";
//        System.out.println(fullName.length()); // 13

        //Concatenation

        String firstName="Sanvi";
        String lastName="Rathore";
        String fullName=firstName + " " + lastName;
        System.out.println(fullName); //Sanvi Rathore
        System.out.println(fullName.charAt(11)); //r

        printLetters(fullName);

        String str="Sanvi";
        System.out.println(isPalindrome(str));
    }
}
