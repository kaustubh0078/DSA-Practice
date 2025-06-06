package Lecture38;

import java.util.ArrayList;
import java.util.List;

public class RightSideView {
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
    int maxLvl = -1;
    List<Integer> list;
    public List<Integer> rightSideView(TreeNode root) {
        list = new ArrayList<>();
        rec(root,0);
        return list;
    }
    public void rec(TreeNode root, int cl){
        if (root == null){
            return;
        }
        if (cl>maxLvl){
            list.add(root.val);
            maxLvl = cl;
        }
        rec(root.right,cl+1);
        rec(root.left,cl+1);
    }
}
