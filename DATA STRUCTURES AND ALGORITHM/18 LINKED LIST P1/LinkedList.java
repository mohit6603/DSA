import java.util.*;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    //methods  static ko hi nahi balki non static ko bhi access kar skte
    public void addFirst(int data){ //tc o(1)
        // s1 create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //s2 naye node ka next point head of preveous
        newNode.next = head;        //link of one node to another

        //s3 head ki value ab new node ban jaye
        head = newNode;
    }

    public void addLast(int data){ //tc o(1)
        Node newNode = new Node(data);
        size++;

        if (tail == null){
            head = tail = newNode;
            return;
        }
        //tail ke next ko point karwa do newnode ki trf
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){         //head already hai no need of input parameter
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            //System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addbetwn(int idx, int data){  //0(n)
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx-1){
            temp = temp.next;
            i++;
        }

        //AT i = idx-1; temp = prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){ // jis node ko delete ker rhe uski val ko return
        if (size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = tail.data;    //head.data
            head = tail = null;
            size = 0;
            return val;
        }
        //prev node == size-2
        Node prev = head;
        for (int i = 0; i <size-2 ; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;   // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while (temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static int helper(Node head, int key){    //actual recursive function
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public static int recSearch(int key){
        return helper(head,key);
    }

    public static void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev; //bcoz curr ab null hogya hai
    }

    public static void deleteNthfromend(int n){
        //calc size
        int size = 0;
        Node temp = null;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        // kya mujhe head ko hi delete karna hai
        if (n == size) {  //last se n matlab surwat se head
            head = head.next;  //remove first operation
            return;
        }
        //size-n tak pouchna hai remaning cases me jisko del krna hai hai usse just 1 phle wala
        int i = 1;
        int iTofind = size-n;
        Node prev = head;
        while (i < iTofind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){ //helper fn
        //slow fast approch
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //mid
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){ //no element and single element case
            return true;
        }
        //s1 mid find
        Node midNode = findMid(head);
        //s2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;  //head node ki jagh ab mid bcoz half me chk
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //righthlf head
        Node left = head;  //lefthalf head

        //s3 lefthalf and righthalf
        while (right != null){
            if(left.data != right.data){
                return false;
            }//update l r
            left = left.next;
            right = right.next;
        }
        return true;
        }

    //zigzage
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //revrse second hlf
        Node currr = mid.next;
        mid.next = null;
        Node prevv = null;
        Node next;

        while (currr != null){
            next = currr.next;
            currr.next = prevv;
            prevv= currr;
            currr = next;
        }
        Node leftt = head;
        Node rightt = prevv;
        Node nextL, nextR;

        //alternate merge zigzag merge
        while (leftt != null && rightt != null){
            nextL = leftt.next;
            leftt.next = rightt;
            nextR = rightt.next;
            rightt.next = nextL;

            leftt = nextL;
            rightt = nextR;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.print();
//        ll.addFirst(2);
//        ll.print();
//        ll.addFirst(1);
//        ll.print();
//        ll.addLast(3);
//        ll.print();
//        ll.addLast(4);
//        ll.print();




//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.addLast(3);
//        ll.addLast(4);
//


//        ll.addbetwn(2,9);
//        ll.addbetwn(4,99);



//        ll.print();
//        System.out.println(ll.size);
//        ll.removeFirst();
//        System.out.println("remove first");
//        ll.print();
//        System.out.println(ll.size);
//        ll.removeLast();
//        System.out.println("remove last");
//        ll.print();
//        System.out.println(ll.size);
//
//


//        System.out.println("linear search key is at index");
//        System.out.println(ll.itrSearch(3));
//        System.out.println(ll.itrSearch(130));
//
//


//        System.out.println("recursive key is at index");
//        System.out.println(ll.recSearch(3));
//        System.out.println(ll.recSearch(30));
//
//        ll.print();
//        ll.reverse();
//        ll.print();
//
//        ll.deleteNthfromend(3);
//        ll.print();





//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(2);
//        ll.addLast(1);
//        ll.print();    //1->2->2->1
//
//        System.out.println(ll.checkPalindrome());


        //zigzag
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //1->2->3->4->5
        ll.print();
        ll.zigZag();
        ll.print();


    }
}

// time complexity 0(n)