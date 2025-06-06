package Lecture38;

public class SymmetricTree {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    public static boolean isSymmetric(Node root) {
        return symmetric(root.left,root.right);
    }
    public static boolean symmetric(Node root1, Node root2){
        if (root1==null && root2==null){
            return true;
        }
        if (root1==null || root2==null){
            return false;
        }
        if (root1.data != root2.data){
            return false;
        }
        boolean left = symmetric(root1.left,root2.right);
        boolean right = symmetric(root1.right,root2.left);

        return left && right;
    }
}
