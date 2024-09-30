package com.company;
import java.util.Arrays;

public class Assignment8 {

    public static int countVowels(String str){
        int count=0;
        str=str.toLowerCase();

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        String str="SAnvi";
//        System.out.println(countVowels(str));

        String str1="earth";
        String str2="heart";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char strchar1[]=str1.toCharArray();
            char strchar2[]=str2.toCharArray();

            Arrays.sort(strchar1);
            Arrays.sort(strchar2);

            boolean result=Arrays.equals(strchar1,strchar2);
            if(result){
                System.out.println(str1 + " and "+ str2 +" are anagrams of each other");
            }
            else{
                System.out.println(str1 + " and "+ str2 +" aren't anagrams of each other");
            }
        }
        else{
            System.out.println(str1 + " and "+ str2 +" aren't anagrams of each other");
        }
    }
}
