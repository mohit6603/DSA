import java.util.*;

public class mergeBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> al) {
        if(root == null){
            return;
        }
        getInorder(root.left, al);
        al.add(root.data);
        getInorder(root.right, al);
    }

    public static Node mergeBST(Node root1, Node root2){
        //s1 get inorder for r1
        ArrayList<Integer> al = new ArrayList<>();
        getInorder(root1, al);


        //s2 get inorder for r2
        ArrayList<Integer> all = new ArrayList<>();
        getInorder(root2, all);

        //s3 merge
        int i=0,j=0;
        ArrayList<Integer> finaal = new ArrayList<>();
        while (i< al.size() && j< all.size()){
            if(al.get(i) <= all.get(j)){
                finaal.add(al.get(i));
                i++;
            }else {
                finaal.add(all.get(j));
                j++;
            }
        }

        while (i< al.size()){
            finaal.add(al.get(i));
            i++;
        }

        while (j< all.size()){
            finaal.add(all.get(j));
            j++;
        }

        //s4 sorted finaal al se balance bst banaye
        return createBST(finaal, 0, finaal.size()-1);
    }


    public static Node createBST(ArrayList<Integer> finaal, int si, int ei){
        if (si > ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(finaal.get(mid));
        root.left = createBST(finaal, si, mid-1);
        root.right = createBST(finaal, mid+1, ei);
        return root;
    }


    public static void preorder(Node root) {
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        /*
         2
        / \
       1   4
         */

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        /*
         9
        / \
       3  12
         */

        Node root = mergeBST(root1,root2);
        preorder(root);
    }
}
//0(n+m) = TC