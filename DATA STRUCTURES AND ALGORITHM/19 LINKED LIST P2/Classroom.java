//JCF

import java.util.LinkedList;

public class Classroom {
    public static void main(String[] args) {
        //create - objects int float boolean nahiiii  Integer Float Character
        LinkedList<Integer> ll = new LinkedList<>();

        //addFirst operation on elements
        ll.addFirst(1);ll.addFirst(2);ll.addFirst(3);ll.addFirst(4);
        System.out.println(ll);

        LinkedList<Integer> dd = new LinkedList<>();
        dd.addLast(1);dd.addLast(2);dd.addLast(3);dd.addLast(4);
        System.out.println(dd);

        //remove operation
        ll.removeFirst();
        dd.removeLast();
        System.out.println(ll);
        System.out.println(dd);
    }
}
