import java.util.*;

public class LinkedListbasics {
    //node class
    //when you will create multiple objects of node class by linking them you will get LL

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

//        public static Node head;
//        public static Node tail;
    }
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        LinkedListbasics ll = new LinkedListbasics();  //same class name ka object bana rahe ho  aur inhe objects se hamari linkedlist banengi
        ll.head = new Node(1);
        ll.head.next = new Node(2); //points next node stroing value 2
        // ll nnam ka object banaya aur ise object ke andr sare ke sare node create krne wle

        // methods will be create to perform operations add search remove print etc
    }
}
