package Lecture40;

public class ValidateBST {
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
    public boolean isValidBST(TreeNode root) {
        return check(root).isbst;
    }
    public class bstPair{
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        boolean isbst = true;
    }

    public bstPair check(TreeNode root){
        if (root == null) {
            return new bstPair();
        }
        bstPair left = check(root.left);
        bstPair right = check(root.right);

        bstPair self = new bstPair();
        self.max = Math.max(root.val,Math.max(left.max, right.max));
        self.min = Math.min(root.val,Math.min(left.min, right.min));
        self.isbst = left.isbst && right.isbst && root.val> left.max
                && root.val< right.min;

        return self;
    }
}
