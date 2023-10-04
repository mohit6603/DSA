import java.util.*;
public class Swaptwonumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        int i1=1,i2=3;
        System.out.println(list);
        swap(list, i1,i2);
        System.out.println(list);
    }
    public static void swap(ArrayList<Integer> list, int i1, int i2) {
        int temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2,temp);
    }
}
