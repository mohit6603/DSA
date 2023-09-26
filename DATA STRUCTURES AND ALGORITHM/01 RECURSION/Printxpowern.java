public class Printxpowern {
    public static void main(String[] args) {
        int X = 2;
        int n = 4;
        System.out.println(power(X,n));
    }

    public static int power(int X,int n) {
        //base
        if(n ==1){
            return X;
        }
//        if(n ==0){
//            return 1;
//        }

        int xnm1 = power(X, n-1);
        int xn = X * xnm1;

        return xn;
    }
}