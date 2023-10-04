import java.util.*;
public class Pairsum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //sorted list hai
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        System.out.println(sum(list, target));
    }

    public static boolean sum(ArrayList<Integer> list, int target) {   //0(n^2)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size() ; j++) {
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
}

//400 false
//5 true