package com.company;
import java.util.*;
import java.util.LinkedList;
//import java.util.Stack;

public class Queue2 {
//    static class Queue{
//        static Stack<Integer> s1 = new Stack<>();
//        static Stack<Integer> s2 = new Stack<>();
//
//        public boolean isEmpty(){
//            return s1.isEmpty();
//        }
//
//        //add -> O(n)
//        public void add(int data){
//            while (!s1.isEmpty()){
//                s2.push(s1.pop());
//            }
//            s1.push(data);
//
//            while (!s2.isEmpty()){
//                s1.push(s2.pop());
//            }
//        }
//
//        //remove -> O(1)
//        public int remove(){
//            if(isEmpty()){
//                System.out.println("queue is empty");
//                return -1;
//            }
//
//            return s1.pop();
//        }
//
//        //peek -> O(1)
//        public int peek(){
//            if(isEmpty()){
//                System.out.println("queue is empty");
//                return -1;
//            }
//
//            return s1.peek();
//        }
//    }

//    static class Stack {
//        static Queue<Integer> q1 = new LinkedList<>();
//        static Queue<Integer> q2 = new LinkedList<>();
//
//        public boolean isEmpty(){
//            return q1.isEmpty() && q2.isEmpty();
//        }
//
//        public void push(int data){ //O(1)
//            if(!q1.isEmpty()){
//                q1.add(data);
//            } else{
//                q2.add(data);
//            }
//        }

//        public int pop(){ //->O(n)
//            if(isEmpty()){
//                System.out.println("empty stack");
//                return -1;
//            }
//
//            int top = -1;
//            //case 1
//            if(!q1.isEmpty()){
//                while (!q1.isEmpty()){
//                    top = q1.remove();
//                    if(q1.isEmpty()){
//                        break;
//                    }
//                    q2.add(top);
//                }
//            } else{
//                while (!q2.isEmpty()){
//                    top = q2.remove();
//                    if(q2.isEmpty()){
//                        break;
//                    }
//                    q1.add(top);
//                }
//            }
//            return top;
//        }
//
//        public int peek(){ //O(n)
//            if(isEmpty()){
//                System.out.println("empty stack");
//                return -1;
//            }
//
//            int top = -1;
//            //case 1
//            if(!q1.isEmpty()){
//                while (!q1.isEmpty()){
//                    top = q1.remove();
//                    q2.add(top);
//                }
//            } else{
//                while (!q2.isEmpty()){
//                    top = q2.remove();
//                    q1.add(top);
//                }
//            }
//            return top;
//        }
//    }

//    public static void printNonRepeating(String str){
//        int[] freq = new int[26]; // 'a' - 'z'
//        Queue<Character> q = new LinkedList<>();
//
//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            q.add(ch);
//            freq[ch-'a']++;
//
//            while (!q.isEmpty() && freq[q.peek()-'a']>1){
//                q.remove();
//            }
//
//            if(q.isEmpty()){
//                System.out.print(-1+" ");
//            } else{
//                System.out.print(q.peek()+" ");
//            }
//        }
//        System.out.println();
//    }
//
//    public static void interleave(Queue<Integer> q){
//        Queue<Integer> firstHalf = new LinkedList<>();
//        int size = q.size();
//
//        for(int i=0; i<size/2; i++){
//            firstHalf.add(q.remove());
//        }
//
//        while (!firstHalf.isEmpty()){
//            q.add(firstHalf.remove());
//            q.add(q.remove());
//        }
//    }

//    public static void reverse(Queue<Integer> q){
//        Stack<Integer> s = new Stack<>();
//
//        while (!q.isEmpty()){
//            s.push(q.remove());
//        }
//
//        while (!s.isEmpty()){
//            q.add(s.pop());
//        }
//    }

    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }
    }

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>(); //ArrayDeque
//        Queue<Integer> q = new ArrayDeque<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }

//        Queue q = new Queue();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }

//        Stack s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }

//        String str = "aabccxb";
//        printNonRepeating(str);

        //Queue<Integer> q = new LinkedList<>();
//        for(int i=1; i<=10; i++){
//            q.add(i);
//        }
//
//        interleave(q);
//        while (!q.isEmpty()){
//            System.out.print(q.remove()+" ");
//        }
//        System.out.println();

//        for(int i=1; i<=5; i++){
//            q.add(i);
//        }
//        reverse(q);
//
//        while (!q.isEmpty()){
//            System.out.print(q.remove()+" ");
//        }
//        System.out.println();

//        Deque<Integer> deque = new LinkedList<>();
//        deque.addFirst(1); //1
//        deque.addFirst(2); //2 1
//        deque.addLast(3);
//        deque.addLast(4);
//        System.out.println(deque);
////        deque.removeFirst();
////        System.out.println(deque);
//        deque.removeLast();
//        System.out.println(deque);
//
//        System.out.println("first el: "+deque.getFirst());
//        System.out.println("last el: "+deque.getLast());

//        Stack s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        System.out.println("peek = "+s.peek());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek = "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}