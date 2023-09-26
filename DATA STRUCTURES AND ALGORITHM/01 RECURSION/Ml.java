public class Ml {
    public static void main(String[] args) {
        String str = "abcabaa";
        counter(str);

    }
    public static void counter(String str){
        int count =0;
        for (int i = 0; i < str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                System.out.print(str.substring(i,j) + " ");
                if(j == str.length()){
                    break;
                }
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println();
        System.out.print("total contigious substring " +( count + str.length()));
    }
}
