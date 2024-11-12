package com.company;
import com.sun.source.tree.ArrayAccessTree;

import java.util.*;

public class ArrayLists2 {

//    public static int storeWater(ArrayList<Integer> height){
//        int maxWater=0;
//        // brute force - O(n^2)
//        for(int i=0; i< height.size(); i++){
//            for(int j=i+1; j< height.size(); j++){
//                int ht=Math.min(height.get(i), height.get(j));
//                int width=j-i;
//                int currWater= ht*width;
//                maxWater=Math.max(maxWater, currWater);
//            }
//        }
//        return maxWater;
//    }


    // 2 pointer approach -> O(n)
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp= height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(currWater,maxWater);

            if(height.get(lp)< height.get(rp)){
                lp++;
            } else{
                rp--;
            }
        }
         return maxWater;
    }
    public static void main(String[] args) {
        //ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
//        ArrayList<Integer> list= new ArrayList<>();
//        list.add(1); list.add(2);
//        mainList.add(list);
//
//        ArrayList<Integer> list2= new ArrayList<>();
//        list2.add(3); list2.add(4);
//        mainList.add(list2);
//
//        for(int i=0; i<mainList.size(); i++){
//            ArrayList<Integer> currList=mainList.get(i);
//            for(int j=0; j<currList.size(); j++){
//                System.out.print(currList.get(j)+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(mainList);

//        ArrayList<Integer> list1= new ArrayList<>();
//        ArrayList<Integer> list2= new ArrayList<>();
//        ArrayList<Integer> list3= new ArrayList<>();
//
//        for(int i=1; i<=5; i++){
//            list1.add(i*1); // 1 2 3 4 5
//            list2.add(i*2); // 2 4 6 8 10
//            list3.add(i*3); // 3 6 9 12 15
//        }
//
//        mainList.add(list1);
//        mainList.add(list2);
//        mainList.add(list3);
//        list3.remove(2);
//        list3.remove(3);
//
//        System.out.println(mainList);
//
//        //nested loop
//        for(int i=0; i< mainList.size(); i++){
//            ArrayList<Integer> currList= mainList.get(i);
//            for(int j=0; j<currList.size(); j++){
//                System.out.print(currList.get(j)+" ");
//            }
//            System.out.println();
//        }

        ArrayList<Integer> height= new ArrayList<>();
        // 1 8 6 2 5 4 8 3 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
