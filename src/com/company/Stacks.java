package com.company;

import java.util.ArrayList;
import java.util.*;

public class Stacks {
//
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    static class Stack{
//        static Node head = null;
//
//        public boolean isEmpty(){
//            return head==null;
//        }
//
//        //push
//        public void push(int data){
//            Node newNode = new Node(data);
//
//            if(isEmpty()){
//                head=newNode;
//                return;
//            }
//
//            newNode.next=head;
//            head=newNode;
//        }
//
//        //pop
//        public int pop(){
//            if(isEmpty()){
//                return -1;
//            }
//            int top = head.data;
//            head = head.next;
//            return top;
//        }
//
//        //peek
//        public int peek(){
//            if(isEmpty()){
//                return -1;
//            }
//            return head.data;
//        }
////        ArrayList<Integer> list = new ArrayList<>();
////        public boolean isEmpty(){
////            return list.size() == 0;
////        }
////
////        //push
////        public void push(int data){
////            list.add(data);
////        }
////
////        //pop
////        public int pop(){
////            if(isEmpty()){
////                return -1;
////            }
////            int top = list.get(list.size()-1);
////            list.remove(list.size()-1);
////            return top;
////        }
////
////        //peek
////        public int peek(){
////            return list.get(list.size()-1);
////        }
//}


    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static String reverseString(String str){
           Stack<Character> s = new Stack<>();
           int idx=0;
           while (idx< str.length()){
               s.push(str.charAt(idx));
               idx++;
           }

           StringBuilder res = new StringBuilder();
           while (!s.isEmpty()){
               char curr = s.pop();
               res.append(curr);
           }

           return res.toString();
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//        pushAtBottom(s,4);
//        while (!s.isEmpty()){
//            System.out.println(s.pop()); // why do we do this?
//        }

//        String str = "abc";
//        System.out.println(reverseString(str));
       // 3 2 1
        reverseStack(s);
        printStack(s);
        //1 2 3
    }
}
