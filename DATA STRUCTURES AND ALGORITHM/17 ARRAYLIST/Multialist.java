import java.util.*;
public class Multialist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);list2.add(6);list2.add(7);
        mainList.add(list2);

        System.out.println(mainList);

        for (int i = 0; i <mainList.size() ; i++) {
            ArrayList<Integer> currlist = mainList.get(i);
            for (int j = 0; j <currlist.size() ; j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
    }
}

