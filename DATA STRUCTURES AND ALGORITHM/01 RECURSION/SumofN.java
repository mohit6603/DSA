public class SumofN {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        int smn1 = sum(n-1);
        int SUM = (n + sum(n-1));
        return SUM;
    }
}

