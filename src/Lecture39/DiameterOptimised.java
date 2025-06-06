package Lecture39;

import Lecture38.Diameter;

public class DiameterOptimised {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).d;
    }
    public class DiaPair{
        int d = 0;
        int h = -1;
    }

    public DiaPair diameter(TreeNode root){
        if (root == null){
            return new DiaPair();
        }
        DiaPair ldp = diameter(root.left);
        DiaPair rdp = diameter(root.right);

        DiaPair sdp = new DiaPair();
        int sd = ldp.h + rdp.h + 2;

        sdp.h = Math.max(ldp.h,rdp.h) + 1;
        sdp.d = Math.max(sd,Math.max(ldp.d, rdp.d));

        return sdp;
    }
}
