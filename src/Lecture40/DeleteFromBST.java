package Lecture40;

public class DeleteFromBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return null;
        }
        if (root.val<key){
            root.right = deleteNode(root.right,key);
        } else if (root.val>key) {
            root.left = deleteNode(root.left,key);
        }
        else {
            if (root.left==null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            else {
                int lmax = Max(root.left);
                root.left = deleteNode(root.left, lmax);
                root.val = lmax;
            }
        }
        return root;
    }
    public int Max(TreeNode temp){
        if (temp == null){
            return Integer.MIN_VALUE;
        }
        int rmax = Max(temp.right);
        return Math.max(temp.val,rmax);
    }
}
