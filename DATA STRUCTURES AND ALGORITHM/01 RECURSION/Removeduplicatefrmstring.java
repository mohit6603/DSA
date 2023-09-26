public class Removeduplicatefrmstring {
    public static void main(String[] args) {
        String str = "appnnacollege";
        remove(str , 0 , new StringBuilder(" "), new boolean[26]);
    }

    public static void remove(String str, int index, StringBuilder newstr, boolean map[]) {
        //base
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currchar = str.charAt(index);
        if(map[currchar-'a'] == true){
            //duplicate
            remove(str,index+1, newstr,map);
        }else {
            map[currchar-'a'] = true;
            remove(str, index+1, newstr.append(currchar), map) ;
        }
    }
}
