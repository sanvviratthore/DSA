package com.company;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.*;

public class ArrayLists {

    public static void swap(ArrayList<Integer> list,int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(2); //O(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

//        list.add(1,9); //O(n)
//
//        System.out.println(list);

//        System.out.println(list.size());
//
//        //print the arrayList
//        for(int i=0; i<list.size(); i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();

        //get operation
        //System.out.println(list.get(2));

        //deleting an element
//        list.remove(2);
//        System.out.println(list);

        //set
//        list.set(2,10);
//        System.out.println(list);

        //contains
//        System.out.println(list.contains(1));
//        System.out.println(list.contains(11));

        //reverse print --> O(n)
//        for(int i=list.size()-1; i>=0; i--){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();

//        int max=Integer.MIN_VALUE;
//        for(int i=0; i<list.size(); i++){
//            max=Math.max(max,list.get(i));
//        }
//
//        System.out.println("Maximum element is: "+max);

//        System.out.println(list);
//        swap(list,1,3);
//        System.out.println(list);

        System.out.println(list);
        Collections.sort(list); //ascending
        System.out.println(list);

        //descending
        Collections.sort(list,Collections.reverseOrder());
        //Comparator - func logic
        System.out.println(list);
    }
}