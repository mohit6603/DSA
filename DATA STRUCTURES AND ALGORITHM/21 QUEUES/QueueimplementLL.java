//IMPLEMENTATION OF QUEUE USING LINKED LISTS

import java.util.*;
public class QueueimplementLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head=null;
        static Node tail=null;
//        static int rear;
//        Queue(int n){
//
//        }

        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        //isFull not neede aas LL dont have any fix size

        //add 0(1)
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){ //no elements exist vala case
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove 0(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            head = head.next;
            if(head == null){ //single element in LL wala case
                tail = null; //if queue become empty update tail
            }
            return front;
        }

        //peek 0(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }

}
