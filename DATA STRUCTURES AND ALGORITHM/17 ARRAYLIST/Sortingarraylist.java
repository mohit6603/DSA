import java.util.ArrayList;
import java.util.Collections;

public class Sortingarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        System.out.println(list);

        //ascending order
        Collections.sort(list);
        System.out.println(list);

        //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
