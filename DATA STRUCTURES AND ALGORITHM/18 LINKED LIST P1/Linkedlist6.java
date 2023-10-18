// REMOVE FIRST

import java.util.*;
public class Linkedlist6 {
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

    public void addFirst(int data) {
        Linkedlist6.Node newnode = new Linkedlist6.Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void removeFirst(){

    }
    public void print(){
        if(head == null){
            System.out.println("ll is empty");
        }
        Linkedlist6.Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist6 ll = new Linkedlist6();
        ll.addFirst(1);ll.addFirst(2);ll.addFirst(3);ll.addFirst(4);
        ll.print();
    }
}
