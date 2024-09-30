package com.company;
import java.util.Scanner;

public class Watermelon {

    public static String wayTooLong(){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        StringBuilder result = new StringBuilder();

        for(int i=1; i<=n; i++){
            String s=sc.next();

            if(s.length()>10){
                int middleLength=s.length()-2;
                result.append(s.charAt(0))
                        .append(String.valueOf(middleLength))
                        .append(s.charAt(s.length()-1))
                        .append("\n");

            }else {
                result.append(s)
                        .append("\n");
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int parts=sc.nextInt();
//        if(parts % 2==0){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }

        System.out.println(wayTooLong());
    }
}
