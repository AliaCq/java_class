package 例题;

import java.util.Stack;

public class 前中后序遍历 {
    public static void preorder(TreeNode root){
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();

        while(cur != null || !stack.isEmpty()){
            while (cur != null){
                System.out.println(cur.val);
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode pop = stack.pop();
            cur = pop.right;
        }
    }

    public static void inorder(TreeNode root) {
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode pop = stack.pop();
            System.out.println(pop.val);
            cur = pop.right;
        }
    }

    public static void postorder(TreeNode root){
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode last = null;

        while(cur != null || !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode peek = stack.peek();

            if(peek.right == null){
                stack.pop();
                System.out.println(peek.val);
                last = peek;
            }else if(peek.right == last){
                stack.pop();
                System.out.println(peek.val);
                last = peek;
            }else {
                cur = peek.right;
            }
        }
    }
}
