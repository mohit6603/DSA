//REMOVE A LOOPCYCLE IN LINEKDLISTS

import java.util.*;
public class Linkedlists2 {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;


    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        //find meeting point  //prev will store last node
        slow = head;
        Node prev = null;
        while (slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //prev.next = null
        prev.next= null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->2

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}

//head se connect mat karna warna error ayengi
//break command dalne se false return ho gyi