//REVERSE STRING USING STACK

import java.util.*;
public class Reversestringstack {

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;

        while (i < str.length()){
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return str = result.toString();  //result sb ko str string me store due to type alag
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));

    }
}
