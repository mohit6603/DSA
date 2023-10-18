//ADD BETWEEN

import java.util.*;
public class Linkedlist5 {
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

    public  void addFirst(int data) {
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addBetween(int data, int idx){
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }
    public void print(){
        if(head == null){
            System.out.println("ll is empty");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Linkedlist5 ll = new Linkedlist5();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();
        System.out.print("null");

        System.out.println();
        ll.addBetween(10,2);
        ll.print();
        System.out.print("null");
    }
}
