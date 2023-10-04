import java.util.*;

public class Containerwithmostwater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < height.size(); i++) {
//            for (int j = i+1; j <height.size() ; j++) {
//                int width = j -i;
//                int Height = Math.min(height.get(i) , height.get(j));
//                int waterstored = width*Height;
//                if(waterstored > max){
//                    max = waterstored;
//                }
//            }
//        }
//        System.out.println("maximum water stored is " + max);
//    }

        System.out.println(storewater(height));
    }

    public static int storewater(ArrayList<Integer> height) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j <height.size() ; j++) {
                int width = j -i;
                int Height = Math.min(height.get(i) , height.get(j));
                int waterstored = width*Height;
                max = Math.max(max , waterstored);
            }
        }
        return max;
    }
}
