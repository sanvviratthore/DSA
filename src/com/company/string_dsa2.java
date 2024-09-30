package com.company;

public class string_dsa2 {

public static float getShortestPath(String s){
    int x=0,y=0;
    s=s.toUpperCase();

    for(int i=0; i<s.length(); i++){
        char dir = s.charAt(i);

        if(dir == 'N'){
            y++;
        } else if(dir == 'S'){
           y--;
        } else if(dir == 'E'){
            x++;
        } else if(dir == 'W'){
            x--;
        }
    }
    int X2=x*x;
    int Y2=y*y;

    return (float)Math.sqrt(X2+Y2);
}

    public static String subString(String str, int si, int ei){
        String substr="";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
//        String path="wnese";
//        System.out.println(getShortestPath(path));

        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("String aren't equal");
        }
//
        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("String aren't equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("String aren't equal");
        }

        String str= "HelloWorld";
        System.out.println(str.substring(0,5));
        //System.out.println(subString(str,0,5));
    }
}
