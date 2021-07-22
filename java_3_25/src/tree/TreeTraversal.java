package tree;

public class TreeTraversal {
    public static void preoder(TreeNode root){
        if(root == null){
            return ;
        }

        System.out.printf("%c ",root.val);
        preoder(root.left);
        preoder(root.right);
    }

    public static void inoder(TreeNode root){
        if(root == null){
            return ;
        }

        inoder(root.left);
        System.out.printf("%c ",root.val);
        inoder(root.right);
    }

    public static void postoder(TreeNode root){
        if(root == null){
            return ;
        }

        postoder(root.left);
        postoder(root.right);
        System.out.printf("%c ",root.val);

    }

    public static void allAdd1(TreeNode root){
        if(root != null){
            root.val += 1;
            allAdd1(root.left);
            allAdd1(root.right);
        }
    }

    public static int count;
    public static void count1(TreeNode root){
        if(root != null){
            count++;
            count1(root.left);
            count1(root.right);
        }
    }

    public static int count2(TreeNode root){
        if(root != null){
            int leftCount = count2(root.left);
            int rightCount = count2(root.right);

            return 1 + leftCount + rightCount;
        }
        return 0;
    }

    private static int leafCount;
    private static void countLeaf1(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leafCount++;
        }
        countLeaf1(root.left);
        countLeaf1(root.right);
    }

    private static int countLeaf2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = countLeaf2(root.left);
        int right = countLeaf2(root.right);

        return left + right;
    }

    private static int getKthSize(TreeNode root,int k) {
        if (root == null) {
            return 0;
        }

        if (k == 1) {
            return 1;
        }

        int left = getKthSize(root.left,k - 1);
        int right = getKthSize(root.right,k - 1);

        return left + right;
    }

    private static int getHight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = getHight(root.left);
        int right = getHight(root.right);

        int m = left > right ? left : right;
        return m + 1;
    }

    private static boolean contains(TreeNode root,int e) {
        if (root == null) {
            return false;
        }

        if(contains(root.left,e)){
            return true;
        }
        if(contains(root.right,e)){
            return true;
        }

        if(root.val == e){
            return true;
        }
        return false;
    }

    public static TreeNode nodeOf(TreeNode root,int e){
        if(root == null){
            return null;
        }
        if(root.val == e){
            return root;
        }
        TreeNode l = nodeOf(root.left,e);
        if(l != null){
            return l;
        }

        TreeNode r = nodeOf(root.right,e);
        if(r != null){
            return r;
        }



        return null;
    }

    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p == q && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        return q.val == p.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public boolean isSubTree(TreeNode s,TreeNode t){
        if(s == null){
            return false;
        }

        if (isSameTree(s,t)){
            return true;
        }

        if (isSubTree(s.left,t)){
            return true;
        }

        if (isSubTree(s.right,t)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree1();
//        System.out.print("前序遍历");
//        TreeTraversal.preoder(root);
//        System.out.println(root);
//
//        System.out.print("中序遍历");
//        TreeTraversal.inoder(root);
//        System.out.println(root);
//
//        System.out.print("后序遍历");
//        TreeTraversal.postoder(root);
//        System.out.println(root);
        nodeOf(root,'A');

    }
}
