
import java.util.*;
public class MirrorOfBST {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node createMirror(Node root){ //0(n)
        if(root == null){
            return null;
        }

        Node lst = createMirror(root.left);
        Node rst = createMirror(root.right);

        root.left = rst;
        root.right = lst;

        return root; //final ans me sirf root milengi par hame puri tree print krwana hai so inorder likhenge
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        /*
         8
        / \
       5   10
      / \   \
     3   6   11
         */

        preorder(root);
        System.out.println();
        root =createMirror(root);
        preorder(root);
    }
}
