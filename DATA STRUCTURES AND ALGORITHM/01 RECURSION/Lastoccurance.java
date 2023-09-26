public class Lastoccurance {
    public static void main(String[] args) {
        int a[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(lastocc(a , key, 0));
    }

    public static int lastocc(int a[], int key, int i) {
        //base
        if(i == a.length){
            return -1;
        }

        //look forward
        int isfound = lastocc(a,key,i+1);
        if(isfound != -1){
            return isfound;
        }

        //compare with self
        if(a[i] == key){
            return i;
        }
        return isfound;
    }
}
