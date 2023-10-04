import java.util.*;

public class Qbarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(monotonic(list));  //Q1  1 2 2 3    5 4 4 3 2 1
        System.out.println(lonely(list));
    }
    public static boolean monotonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i <list.size()-1 ; i++) {
            if(list.get(i) < list.get(i+1)){
                inc = false;
            }if(list.get(i) > list.get(i+1)){
                dec = false;
            }
        }return inc || dec ;
    }

    public static ArrayList<Integer> lonely(ArrayList<Integer>list) {
        Collections.sort(list);

        ArrayList<Integer> New = new ArrayList<>();
        for (int i = 1; i <list.size()-1 ; i++) {
            if(list.get(i-1)+1 < list.get(i) && list.get(i)+1<list.get(i+1)){
                New.add(list.get(i));
            }
        }

        if (list.size() == 1){
            New.add(list.get(0));
        }

        if(list.size() > 1){
            if(list.get(0)+1 < list.get(1)){
                New.add(list.get(0));
            }
            if(list.get(list.size()-2)+1 < list.get(list.size()-1)){
                New.add(list.get(list.size()-1));
            }
        }
        return New;
    }
}
