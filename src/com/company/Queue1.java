package com.company;

import java.util.Objects;

public class Queue1 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
//        static int arr[];
//        static int size;
//        static int rear;
//        static int front; // because in circular queue the position of front is also not fixed

//        Queue(int n){
//            arr = new int[n];
//            size = n;
//            rear = -1;
//            front = -1;
//        }

        static Node head = null;
        static Node tail = null;

//        public boolean isEmpty(){
//            return rear == -1 && front == -1;
//        }

        public boolean isEmpty(){
            return head==null && tail==null;
        }

//        public boolean isFull(){
//            return (rear+1) % size == front;
//        }

        //add
//        public void add(int data){
//            if(isFull()){
//                System.out.println("Queue is full");
//                return;
//            }
//            //add 1st element
//            if(front == -1){
//                front = 0;
//            }
//            rear = (rear+1) % size;
//            arr[rear] = data;
//        }

        public void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

//            int result = arr[front];
//            if(rear == front){
//                rear = front =-1;
//            } else {
//                front = (front+1) % size;
//            }
//            return result;

            int front = head.data;
            if(tail == head){
                tail=head=null;
            } else{
                head=head.next;
            }
            return front;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            //return arr[front];
            return head.data;
        }
    }

    public static void main(String[] args) {
        //Queue q = new Queue(3); //see dry run
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        //1 2 3
//        System.out.println(q.remove()); // only for understanding circular queue logic
//        q.add(4);
//        System.out.println(q.remove());
//        q.add(5);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
