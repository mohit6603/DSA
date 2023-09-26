public class Printntoone {
    public static void main(String[] args) {
        int n= 10;
        printno(n);
    }

    public static void printno(int n) {
        //base
        if (n == 1) {
            System.out.println(1);
            return;
        }
        //kam
        System.out.print(n +" ");
        //innerfn
        printno(n-1);

    }
}
