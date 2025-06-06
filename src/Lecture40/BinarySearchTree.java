package Lecture40;

import Lecture37.BinaryTree;

public class BinarySearchTree {
    public class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    private Node root;

    public BinarySearchTree(int in[]) {
        this.root = createTree(in,0,in.length-1);
    }

    public Node createTree(int[] in, int si, int ei){
        if (si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node n = new Node(in[mid]);

        n.left = createTree(in, si, mid-1);
        n.right = createTree(in, mid+1, ei);

        return n;
    }
    
    public void Display() {
        display(root);
    }
    private void display(Node n) {
        if(n == null) {
            return;
        }
        String s = ""  + n.val;
        if(n.left!=null) {
            s = n.left.val + " <==" + s;
        }
        else {
            s =  ". <==" + s;
        }
        if(n.right!=null) {
            s = s+ "==> " + n.right.val;
        }
        else {
            s = s+ "==> .";
        }
        System.out.println(s);
        display(n.left);
        display(n.right);

    }

    public static void main(String[] args) {
        int[] inorder = {7,10,15,20,25,30,35};
        BinarySearchTree bst = new BinarySearchTree(inorder);
        bst.Display();
    }
}
