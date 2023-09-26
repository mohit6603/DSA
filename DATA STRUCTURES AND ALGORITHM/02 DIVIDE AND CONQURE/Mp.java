public class Mp {
    public static void main(String[] args) {
        rect(10,4);
    }
    public static void rect(int row, int coloum) {
        for (int i = 1; i <= coloum ; i++) {
            for (int space = 1; space <=row-i ; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
