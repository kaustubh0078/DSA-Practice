package Lecture38;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideLevelOrder {
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> h = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            TreeNode temp = q.poll();
            if (temp.left!=null){
                h.offer(temp.left);
            }
            if (temp.right!=null){
                h.offer(temp.right);
            }
            if (q.isEmpty()){
                list.add(temp.val);
                q = h;
                h = new LinkedList<>();
            }
        }
        return list;
    }
}
