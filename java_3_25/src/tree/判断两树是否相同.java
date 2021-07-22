package tree;

public class 判断两树是否相同 {
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p == q && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        return q.val == p.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
