package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment12 {

    public static boolean monotone(int n, ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            if(list.get(i)<=list.get(i+1)){
                return true;
            } else if(list.get(i)>= list.get(i+1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of elements of your list: ");
        int n=sc.nextInt();
        System.out.println("Elements: ");
        for(int i=0; i<n; i++){
            i= sc.nextInt();
            list.add(i);
        }
        System.out.println(monotone(n,list));
    }
}
