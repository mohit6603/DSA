public class Prnitoneton {
    public static void main(String[] args) {
        int n = 100;
        print(n);
    }

    public static void print(int n) {
        //base
//        if(n==10){
//            System.out.print(n);
//            return;
//        }
//
//        //kaam
//        System.out.print(n + " ");
//
//        //call
//        print(n+1);

        //base
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        print(n-1);
        System.out.print(n + " ");
    }
}
