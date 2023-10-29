import java.util.*;

public class MinDistance {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

// MINIMUM DISTANCE
    public static Node lca2(Node root, int n1, int n2){
        if(root == null ||root.data == n1 || root.data ==n2){
            return root;
        }
        Node leftlca = lca2(root.left, n1,n2);
        Node rightlca = lca2(root.right, n1,n2);

        if(rightlca == null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }
        return root;
    }

    public static int lcaDistance(Node root, int n){
        if (root == null) {
            return -1;
        }
        if (root.data == n){
            return 0;
        }
        int leftdistance = lcaDistance(root.left,n);
        int rightdistance = lcaDistance(root.right,n);

        if(leftdistance==-1 && rightdistance == -1){
            return -1;
        }else if(leftdistance == -1){
            return rightdistance+1;
        }else {
            return leftdistance+1;
        }
    }


    public static int minDistance(Node root, int n1, int n2){
        Node lca = lca2(root,n1,n2);
        int d1 = lcaDistance(lca,n1);
        int d2 = lcaDistance(lca,n2);

        return d1+d2;
    }


//K th ANCESTOR
    public static int kAncestor(Node root, int n, int k){
        if(root == null){//bc
            return -1;
        }

        if(root.data == n){//rootdata and n overlap
            return 0;
        }

        int leftdistance = kAncestor(root.left,n,k);//left distance
        int rightdistance = kAncestor(root.right,n,k);//rt dist

        //chk krlo -1 to nh h it means jis node ko find karna hai uska ancestor hu hi nahi
        if(leftdistance==-1 && rightdistance == -1){
            return -1;
        }

        int max = Math.max(leftdistance,rightdistance);
        if(max+1 == k){
            System.out.println(root.data);
        }

        return max+1;
    }


// Transform to sum tree
    public static int transformsum(Node root){
        if(root == null){
            return 0;
        }
        int leftchild = transformsum(root.left);
        int rightchild = transformsum(root.right);

        int data = root.data;

        int newleft = root.left ==null ? 0 : root.left.data; //null hone par data nhi nikal payenge tb usee 0 kr dere hai
        int newRight = root.right == null?0: root.right.data;
        root.data = newleft + newRight + leftchild + rightchild;
        return data;
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //1
        int n1 = 4;
        int n2 = 5;
        System.out.println(minDistance(root,n1,n2));

        //2
        int n = 5;
        int k = 2;
        kAncestor(root,n,k);

        //3
        transformsum(root);
        preorder(root);

    }
}
