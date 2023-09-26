public class Stringpermutation {
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
    public static void permutation(String str, String ans){
        //base
        if(str.length() == 0){
            System.out.println(ans);
            return;

        }
        //recursion
        for (int i = 0; i <str.length() ; i++) {
            char curr = str.charAt(i);
            //"abcde" remove c ? "ab"+"de" = "abde"
            String newstr = str.substring(0,i) + str.substring(i+1);
            permutation(newstr, ans+curr);
        }
    }
}
