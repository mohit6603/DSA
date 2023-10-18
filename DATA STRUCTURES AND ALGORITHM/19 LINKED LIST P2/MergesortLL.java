import java.util.LinkedList;

public class MergesortLL {
    public class Node{
        Node next;
        int data;
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node();
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        //newNode = head; wrong
        head = newNode;
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

    public Node mergeSort(Node head){
        if (head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left & right MS
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);

        //merge
        return merge(newLeft,newRight);
    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid return
    }

    public Node merge(Node head1, Node head2){  //h1 LH   H2  RH
        Node mergedLL = new Node();
        Node temp = mergedLL;

        while (head1!= null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            }else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }
    public static void main(String[] args) {
        MergesortLL ll = new MergesortLL();
        ll.addFirst(1);ll.addFirst(2);ll.addFirst(3);ll.addFirst(4);ll.addFirst(5);
        ll.print();

        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}
