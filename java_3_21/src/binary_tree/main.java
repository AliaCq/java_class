package binary_tree;

public class main {
    public static void main(String[] args) {
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');

        a.left = b;
        a.right = c;
        b.left = d;
        c.left = e;
        c.right = f;
        TreeNode root = a;
    }
}
