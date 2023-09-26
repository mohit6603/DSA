public class Optimizepower {
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(optimizepower(a,n));
    }

    public static int optimizepower(int a,int n) {
        //0(n)
//        if(n ==1){
//            return a;
//        }
//
//        int halfpower = optimizepower(a,n/2) * optimizepower(a,n/2);
//
//        //n odd
//        if (n%2 !=0) {
//            halfpower = a * halfpower;
//        }
//
//        return halfpower;


        //0(logn) optimized power function
        if(n ==1){
            return a;
        }

        int halfpower = optimizepower(a,n/2);
        int halfpowersq  = halfpower*halfpower;

        //n odd
        if (n%2 !=0) {
            halfpowersq = a * halfpowersq;
        }

        return halfpowersq;
    }
}
