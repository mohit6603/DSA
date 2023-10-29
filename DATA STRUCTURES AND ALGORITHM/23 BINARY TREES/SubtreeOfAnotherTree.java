public class SubtreeOfAnotherTree {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            data = this.data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if (!isIdentical(node.right,subRoot.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        //find node
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
//        boolean leftAns = isSubtree(root.left, subRoot); // exist krne pr true return
//        boolean rightAns = isSubtree(root.right, subRoot); //exist krne pr true return
//
//        return leftAns || rightAns;

        return isSubtree(root.left , subRoot) || isSubtree(root.right, subRoot); // ye likhna behatar hai kyuki yadi 1 stmnt true ho jati hai tab dusri wali execute nhi hngi else vice versa

    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

    /*
         1
        / \
       2   3
      / \  / \
     4  5  6  7
    */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        /*
         2
        / \
       4   5
        */

        System.out.println(isSubtree(root, subRoot));
    }
}
