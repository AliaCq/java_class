package 剑指Offer36;

public class Solution {
    private Node head;
    private Node last;

    public Node treeToDoublyList(Node root){
        if(root == null){
            return null;
        }
        head = null;
        last = null;
        inorder(root);
        head.left = last;
        last.right = head;
        return head;
    }

    private void inorder(Node node) {
        if(node != null){
            inorder(node.left);

            if(last != null){
                last.right = null;
            }else {
                head = node;
            }
            node.left = last;
            last = node;

            inorder(node.right);
        }
    }
}
