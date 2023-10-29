import java.util.*;

public class Lca {
     static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static boolean getPath(Node root, int n, ArrayList<Node> path){  //APPROCH 1
         if(root == null){ // node n exist nahi karta
             return false;
         }
         path.add(root);
         if(root.data == n){ // jaise node mil gyi ab subtree me jane ki jrurt nahi hai
             return true;
         }

         //node nahi milne par subtree me jao search kre
         boolean foundleft = getPath(root.left, n, path); //lft
         boolean foundright = getPath(root.right, n, path); //rght

         if (foundleft || foundright){ //condn for node found in lst or rst subtree
             return true;
         }

         path.remove(path.size()-1); //lst rst me nahi milne pr remove  bcoz root path ka hisa nahi hai

        return false;
    }

    public static Node lca(Node root, int n1, int n2){ //node return   0(n)
         //path find hnga yaha
         ArrayList<Node> path1 = new ArrayList<>();
         ArrayList<Node> path2 = new ArrayList<>();

         getPath(root, n1, path1); //root se lekr n1 tak ka path path1 me store krke denga
         getPath(root, n2, path2); //root se lekr n2 tak ka path path1 me store krke denga

         //path1 2 are calc by getpath function
         //LCA find
        int i = 0;
        for(; i < path1.size() && 1<path2.size(); i++) {
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //last equal value jo hongi vo i-1 th index par
        Node lca = path1.get(i-1);

        return lca;
    }


    //APPROCH 2
    public static Node lca2(Node root,int n1, int n2){
         //bc
//        if(root == null){
//            return null;
//        }
         if(root == null ||root.data == n1 || root.data ==n2){ //case where n1 or n2 is root tab lca2 hi root ban jayenga
                 return root;
         }
         //find lca2 in subtree
         Node leftlca = lca2(root.left, n1,n2);
         Node rightlca = lca2(root.right, n1,n2);

         //Leftlca = valid value & rightlca = null
        if(rightlca == null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }

        //yadi dono ne hi null nahi diya matlab last me 1 node exist krta hai aur rst me 1
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 7;
        //2 is lca of 4 5
        //1 is lca of 4 7
        System.out.println("lowest common ancestor is = "+ (lca(root, n1, n2).data));

        System.out.println(lca2(root,n1,n2).data); //approch 2
    }
}
