//import java.util.*;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        //create arraylist
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<Float> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();

        //add opertaion TC = 0(1)
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(0);

        System.out.println(list);

        //get operation TC = 0(1)
        int element = list.get(0);
        System.out.println(element);

        //remove operation TC = 0(n)
        list.remove(1);
        System.out.println(list);

        //set element at index TC = 0(n)
        list.set(2,10);
        System.out.println(list);

        //contains element TC = 0(n)
        //checks wether element exist in given arraylist or not
        System.out.println(list.contains(5));
        System.out.println(list.contains(55));

        //add direct at index  TC = 0(n)
        list.add(3,100);
        System.out.println(list);

        //size of arraylist
        System.out.println(list.size());

        //print arraylist iterate on AL
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
