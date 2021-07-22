package tree;

public class BuildTree {
    public static TreeNode buildTree1(){
        TreeNode a = new TreeNode('a');
        TreeNode b = new TreeNode('b');
        TreeNode c = new TreeNode('c');
        TreeNode d = new TreeNode('d');
        TreeNode e = new TreeNode('e');
        TreeNode f = new TreeNode('f');
        TreeNode g = new TreeNode('g');
        TreeNode h = new TreeNode('h');

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.right = h;

        return a;
    }
    public static void main(String[] args) {
        TreeNode root = buildTree1();
        System.out.print("前序遍历");
        TreeTraversal.preoder(root);
        System.out.println(root);

        System.out.print("中序遍历");
        TreeTraversal.inoder(root);
        System.out.println(root);

        System.out.print("后序遍历");
        TreeTraversal.postoder(root);
        System.out.println(root);
    }
}
