//IMPLEMENTATION OF QUEUE USING JCF

import java.util.*;
public class QueuesJCF {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>(); //queue jcf me class nhi hoti vo ek interface hota hai
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println("-----------");
        Queue <Integer> d = new ArrayDeque<>();
        d.add(4);
        d.add(5);
        d.add(6);

        while (!d.isEmpty()){
            System.out.println(d.peek());
            d.remove();
        }
    }
}


//two classese used to create queue 1. linkedlist 2. ArrayDeque