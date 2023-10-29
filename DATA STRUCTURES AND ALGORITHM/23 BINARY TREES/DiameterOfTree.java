//import java.util.*;
//
//public class DiameterOfTree {
//
//    static class Node{
//        int data;
//        Node left,right;
//
//        public Node(int data){
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    public static int height(Node root){
//        if(root == null){
//            return 0;
//        }
//
//        int lh = height(root.left);
//        int rh = height(root.right);
//        int Height  = Math.max(lh, rh)+1;
//
//        return Height;
//    }
//
//    public static int diameter(Node root){ //0(n^2)
//        if(root == null){
//            return 0;
//        }
//        int leftdia = diameter(root.left);
//        int leftheight = height(root.left);
//
//        int rightdia = diameter(root.right);
//        int rightheight = height(root.left);
//
//        int selfDiam = leftheight+rightheight+1;
//        return Math.max(selfDiam, Math.max(leftdia,rightdia)); //pphle andar wala fn value calc krenga
//    }
//
//
//    public static void main(String[] args) {
//        Node root = new Node( 1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.right = new Node(6);
//        root.right.left = new Node(7);
//
//        System.out.println(diameter(root));
//    }
//}


//OPTIMIZE  0(n)
import java.util.*;

public class DiameterOfTree {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){ //0(n)
        if (root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }


    public static void main(String[] args) {
        Node root = new Node( 1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        System.out.println(diameter(root).diam);
    }
}

