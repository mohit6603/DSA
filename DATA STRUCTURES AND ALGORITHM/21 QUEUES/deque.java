//DEQUE DS jsl

import java.util.*;
public class deque {
    public static void main(String[] args) {
        // FIRST OPERATION
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        System.out.println(d);  //recent nos front me add hote jayenge
        d.removeFirst();
        System.out.println(d);
        System.out.println(d.getFirst());


        System.out.println("============================================");


        // LAST OPERATION
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        System.out.println(dq); //recent elements last me add hnge
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.getLast());
    }
}
