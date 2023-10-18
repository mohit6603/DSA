//DUPLICATE PARANTHESES   //0(n)

//import java.util.*;
//public class Duplicateparantheses {
//    public static boolean isDuplicate(String str2) {
//        Stack<Character> s = new Stack<>();
//
//        for (int i = 0; i <str2.length() ; i++) {
//            char ch = str2.charAt(i);
//            //closing
//            if(ch == ')'){
//                int count = 0;
//                while (s.peek() != '('){       //!s.isEmpty() nahi use kenge bcoz yadi closing ayi hai matlab opening to hongi hi
//                    s.pop();
//                    count++;
//                }
//                if (count < 1){
//                    return true; //duplicate
//                }else {
//                    s.pop(); //opening pair pop
//                }
//            }else {
//                //opening
//                s.push(ch);
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        String str = "((a+b))";//true
//        String str2 = "(a-b)";//false
//
//        System.out.println(isDuplicate(str));
//    }
//}




//DUPLICATE PARANTHESES   //0(n)

import java.util.*;
public class Duplicateparantheses {
    public static boolean isDuplicate(String str2) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i <str2.length() ; i++) {
            char ch = str2.charAt(i);
            //closing
            if(ch == ')'){
                int count = 0;
                while (s.pop() != '('){       //!s.isEmpty() nahi use kenge bcoz yadi closing ayi hai matlab opening to hongi hi
                    count++;
                }
                if (count < 1){
                    return true; //duplicate
                }
            }else {
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";//true
        String str2 = "(a-b)";//false

        System.out.println(isDuplicate(str));
    }
}
