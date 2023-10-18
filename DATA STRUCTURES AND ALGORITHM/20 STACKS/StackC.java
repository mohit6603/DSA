//IMPLEMENTATION OF STACK USING LINKEDLIST

import java.util.*;

public class StackC {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;
        static Node tail;

        //isempty
        public static boolean isEmpty(){
            return head==null;
        }

        //push
        public static void push(int data){ //in LL top ko push karna matlab head ko delete krna
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);s.push(3);s.push(2);s.push(1);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
