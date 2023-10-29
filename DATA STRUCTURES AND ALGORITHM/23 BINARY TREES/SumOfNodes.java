import java.util.*;

public class SumOfNodes {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sumOfnodes(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumOfnodes(root.left);
        int rightsum = sumOfnodes(root.right);

        return leftsum+rightsum+root.data;
    }

    public static void main(String[] args) {
        Node root = new Node( 1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        System.out.println(sumOfnodes(root));
    }
}
