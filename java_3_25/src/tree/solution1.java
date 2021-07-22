package tree;

import java.util.ArrayList;
import java.util.List;

public class solution1 {
    private List<Integer> list = new ArrayList<>();
    private void preorder(TreeNode root){
        if(root == null){
            return;
        }

        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public List<Integer> preoderTraversal(TreeNode root) {
        list.clear();
        preorder(root);
        return list;
    }

    private void inorder(TreeNode root){
        if(root == null){
            return;
        }

        preorder(root.left);
        list.add(root.val);
        preorder(root.right);
    }

    public List<Integer> inoderTraversal(TreeNode root) {
        list.clear();
        inorder(root);
        return list;
    }

    private void postorder(TreeNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        list.add(root.val);
    }

    public List<Integer> postoderTraversal(TreeNode root) {
        list.clear();
        postorder(root);
        return list;
    }
}
