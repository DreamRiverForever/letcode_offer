import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class isSymmetric {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p==null&&q==null)
            return true;
        if (p==null || q==null)
            return false;
        return p.val==q.val&&check(p.left,q.right)&&check(p.right,q.left);
    }

    public boolean check2(TreeNode p, TreeNode q){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);
        while (!queue.isEmpty()){
            p = queue.poll();
            q = queue.poll();
            if (p==null&&q==null)
                return true;
            if ((p==null||q==null)||(p.val!=q.val))
                return false;
            queue.offer(p.left);
            queue.offer(q.right);
            queue.offer(p.right);
            queue.offer(q.left);
        }
        return true;
    }

}
