public class isSameTree {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null || q == null) {
            return false;
        }
        boolean root = p.val == q.val ? true : false;
        if (!root) return false;
        boolean left = isSameTree(p.left, q.left);
        if (!left) return false;
        boolean right = isSameTree(p.right, q.right);
        if (!right) return false;
        return root && left && right;

    }
}
