import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeB {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1; //static kyu har recursion level me hr node pr index update hona chaiyea
        //0(n) TC
        public static Node buildTree(int nodes[]){ //tree ka root return honga
            idx++; //0 1st element create
            if(nodes[idx] == -1){
                return null; // left nd right child banane ki jrurt to nhi hai null k liye
            }

            // !=-1
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes); //ye left subtree bna kr de denga
            newNode.right = buildTree(nodes); // ye right subtree bana kar de denga ye = jod raha hai root ko lst rst ko

            return newNode;
        }

        // PREORDER TRAVERSAL
        public static void preorder(Node root){ //0(n)
            if(root == null){
                System.out.print("-1" + " ");
                return;
            }
            //print root data
            System.out.print(root.data + " ");
            //print left subtree
            preorder(root.left);
            //print right subtree
            preorder(root.right);
        }


        //INORDER TRAVERSAL
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        //POSTORDER TRAVERSAL
        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        //LEVEL ORDER TRAVERSAL
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            //add root and null initialy
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                //jabtak q khali nahi ho jati tab tak
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if (q.isEmpty()){
                        break;
                    }else {
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        //0(n) tc
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);


        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelOrder(root);
    }
}
