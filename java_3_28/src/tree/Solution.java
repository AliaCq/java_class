package tree;

import java.util.Arrays;

public class Solution {
    public static TreeNode buildTree0(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int rootValue = preorder[0];
        TreeNode root = new TreeNode(rootValue);

        int leftSize = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                leftSize = i;
            }
        }

        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, 1 + leftSize);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, leftSize);
        root.left = buildTree0(leftPreorder, leftInorder);

        int[] rightPreorder = Arrays.copyOfRange(preorder, 1 + leftSize, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, leftSize + 1, inorder.length);
        root.right = buildTree0(rightPreorder, rightInorder);

        return root;
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0) {
            return null;
        }
        int rootValue = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(rootValue);

        int leftSize = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                leftSize = i;
            }
        }



        int[] leftPastorder = Arrays.copyOfRange(postorder, 0, leftSize);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, leftSize);
        root.left = buildTree(leftPastorder, leftInorder);

        int[] rightPastorder = Arrays.copyOfRange(postorder, leftSize, postorder.length - 1);
        int[] rightInorder = Arrays.copyOfRange(inorder,  leftSize + 1, inorder.length);
        root.right = buildTree(rightPastorder, rightInorder);


        return root;
    }

    private StringBuilder sb;

    private void preorder(TreeNode root) {
        if (root == null) {
            sb.append("()");
            return;
        }
        sb.append("(");
        sb.append(root.val);
        if(root.left == null && root.left == null){

        }else if(root.right == null){
            preorder(root.left);
        }else{
            preorder(root.left);
            preorder(root.right);
        }
        sb.append(")");
    }

    public String tree2str(TreeNode t) {
        sb = new StringBuilder();
        preorder(t);
        sb.delete(0, 1);
        sb.delete(sb.length() - 1, sb.length());

        return sb.toString();
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);

        n1.left = n2; n1.right = n3;
        n2.left = n4;

        Solution s = new Solution();
        String s1 = s.tree2str(n1);
        System.out.println(s1);
    }
}
