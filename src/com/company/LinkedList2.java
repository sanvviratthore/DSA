package com.company;
import java.util.LinkedList; //JCF->Optimized

public class LinkedList2 {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll= new LinkedList();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);
        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
