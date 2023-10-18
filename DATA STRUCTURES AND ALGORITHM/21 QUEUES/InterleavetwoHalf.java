
import java.util.*;
public class InterleavetwoHalf {
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firsthlf = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size/2; i++) {  //q,size/2 yaha mat krna size dynamic ho jayenga
            firsthlf.add(q.remove());
        }
        while (!firsthlf.isEmpty()){
            q.add(firsthlf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);
        q.add(6);q.add(7);q.add(8);q.add(9);q.add(10);

        interLeave(q);
        while (!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
