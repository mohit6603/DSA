public class Firstoccurance {

    public static void main(String[] args) {
        int a[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(firstocc(a , key,0));
    }
    //first time jaha value occure hongi uski index ko return krwa dena hai
    public static int firstocc(int a[] ,int key, int i) {
        //base
//        if(i == a.length-1){
//            if(a[i] != key){
//                return -1;
//            }else {
//                return i;
//            }
//        }

        //base 2
        if (i == a.length) {
            return -1;
        }

        //first occ wala return ho jayenga
        if(a[i] == key){
            return i;
        }

        //recursive
        return firstocc(a,key,i+1);
    }
}
