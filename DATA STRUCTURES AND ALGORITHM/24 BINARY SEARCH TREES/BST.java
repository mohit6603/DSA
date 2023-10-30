//BUILD A BINARY SEARCH TREE

import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(int val, Node root){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //val ko LST me dal do
            root.left = insert(val, root.left);
        }
        else{
            root.right = insert(val, root.right);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //SEARCH IN BST
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }else {
            return search(root.right, key);
        }
    }

    //DELETE A NODE
    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }else{//voila
            //case 1 leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //case 3  both children exist lst and rst
            Node IS = findInordersuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInordersuccesor(Node root){ //root me hamesa not null value hi ayengi bcoz null wala case handle krke ho gy hai
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1,k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1,k2);
        }
        else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1,k2);
        }
    }

    
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i <= path.size()-1; i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println("Null");
    }


    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min,root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
//        int values[] = {8,5,3,1,4,6,10,11,14};
        int values[] = {8,5,3,6,10,11,14};

        Node root = null;

        for (int i = 0; i <values.length ; i++) {
            root = insert(values[i],root);
        }
        inorder(root);
        System.out.println();


        //is valid BST
        if(isValidBST(root,null, null)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }



        //print root to leaf
//        printRoot2Leaf(root, new ArrayList<>());


        //print in range
//        printInRange(root, 5, 12);


        //delete in bst
//        root = delete(root, 1);
//        System.out.println();
//        inorder(root);


        //search in bst
//        if(search(root,11)){
//            System.out.println("found");
//        }else {
//            System.out.println("not found");
//        }

    }
}
