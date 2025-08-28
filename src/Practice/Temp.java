package Practice;

public class Temp {
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
    public boolean isBalanced(TreeNode root) {
        return helper(root).b;
    }
    public class Balpair{
        boolean b = true;
        int h = -1;
    }
    public Balpair helper(TreeNode root){
        if (root==null){
            return new Balpair();
        }
        Balpair lbp = helper(root.left);
        Balpair rbp = helper(root.right);
        Balpair sbp = new Balpair();

        sbp.h = Math.max(lbp.h, rbp.h)+1;
        sbp.b = Math.abs(lbp.h- rbp.h)<=1;

        return sbp;
    }
}
