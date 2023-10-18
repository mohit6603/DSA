//SIZE CALCULATION

import java.util.*;
public class Linkedlist4 {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
        public void print(){
        if(head == null){
            System.out.print("ll is empty");
        }
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Linkedlist4 ll = new Linkedlist4();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();
        System.out.print("null");
    }
}
