package Lecture39;

public class BuildTreePreorder_Inorder {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode build(int[] preorder, int psi, int pei, int[] inorder, int isi, int iei){
        if (psi>pei || isi>iei){
            return null;
        }
        TreeNode node = new TreeNode(preorder[psi]);
        int idx = find(inorder, preorder[psi], isi, iei);
        int count = idx - isi;
        node.left = build(preorder, psi+1, psi+count, inorder, isi, idx-1);
        node.right = build(preorder, psi+count+1, pei, inorder, idx+1, iei);
        return node;
    }
    public int find(int[] inorder, int target, int isi, int iei){
        for (int i = isi; i <= iei; i++) {
            if (inorder[i] == target){
                return i;
            }
        }
        return -1;
    }
}
