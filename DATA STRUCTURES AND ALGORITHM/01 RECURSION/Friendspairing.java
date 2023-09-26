public class Friendspairing {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(pair(n));
    }

    public static int pair(int n) {
        //base
        if(n==1 || n==2){
            return n;
        }

//        //initial single
//        int fnm1 = pair(n-1);
//
//        //remaning pairing
//        int fnm2 = pair(n-2);
//
//        // initial pairing ways
//        int pairways = (n-1)*fnm2;
//
//        return fnm1+pairways;

        return pair(n-1) +(n-1) *pair(n-2);
    }
}
