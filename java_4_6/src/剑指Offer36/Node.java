package 剑指Offer36;

public class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {
    }
    public Node(int val) {
        this.val = val;
    }

    public Node(int val,Node left,Node right) {
        this.val = val;
        this.right = right;
        this.left = left;
    }

}
