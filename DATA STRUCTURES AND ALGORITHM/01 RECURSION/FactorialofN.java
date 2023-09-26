public class  FactorialofN {
    public static void main(String[] args) {
        int n= 5;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        //base s3
        if (n == 0) {
            return 1;
        }
        //s1
        int fnm1 = factorial(n-1);  //f(n-1) only assumption krli ki vo calc ho jayenge
        //s2
        //int fn = n * factorial(n-1);
        int fn = (n * fnm1);
        //s4
        return fn;
    }
}

