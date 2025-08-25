package Lecture39;

import java.util.IllegalFormatCodePointException;

public class BuildTreeInOrder_PostOrder {
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,postorder,0, postorder.length-1, 0, inorder.length-1);
    }
    public TreeNode helper(int[] inorder, int[] postorder, int psi, int pei, int isi, int iei){
        if (psi>pei || isi>iei){
            return null;
        }
        TreeNode node = new TreeNode(postorder[pei]);
        int idx = find(inorder, postorder[pei], isi, iei);
        int count = idx - isi;  //size of tree

        node.left = helper(inorder,postorder,psi, psi+count-1, isi, idx-1);
        node.right = helper(inorder,postorder,psi+count,pei-1,idx+1,iei);

        return node;
    }
    int find(int[] inorder, int target, int isi, int iei){
        for (int i = isi; i <= iei; i++) {
            if (inorder[i]==target){
                return i;
            }
        }
        return -1;
    }
}
