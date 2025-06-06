package Lecture39;

public class BalancedTreeOptimised {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode lbp, TreeNode rbp) {
            this.val = val;
            this.left = lbp;
            this.right = rbp;
        }
    }
    public boolean isBalanced(TreeNode root) {
        return balanced(root).b;
    }
    public class BalPair{
        boolean b = true;
        int h = -1;
    }
    public BalPair balanced(TreeNode root){
        if (root==null){
            return new BalPair();
        }
        BalPair lbp = balanced(root.left);  // left balanced pair
        BalPair rbp = balanced(root.right);  // right balanced pair

        BalPair sbp = new BalPair();  // self balanced pair
        boolean sb = Math.abs(lbp.h - rbp.h) <=1;
        sbp.b = lbp.b && rbp.b && sb;
        sbp.h = Math.max(lbp.h, rbp.h)+1;

        return sbp;
    }
}
