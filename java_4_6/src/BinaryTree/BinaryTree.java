package BinaryTree;

public class BinaryTree {
    public Node root = null;

    public void insert(int key){
        if(root == null){
            root = new Node(key);
        }
        Node parent = null;
        Node cur = root;
        while (cur != null){
            if(key == cur.key){
                throw new RuntimeException();
            }
            else if (key < cur.key){
                parent = cur;
                cur = cur.left;
            }else {
                parent = cur;
                cur = cur.right;
            }
        }
        if(key < parent.key){
            parent.left = new Node(key);
        }else {
            parent.right = new Node(key);
        }
    }

    public boolean reserch(int key){
        Node cur = root;
        while (cur != null){
            if(key == cur.key){
                return true;
            }
            else if (key < cur.key){
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }
        return false;
    }

    public boolean remove(int key){
        Node parent = null;
        Node cur = root;
        while (cur != null){
            if(cur.key == key){
                removeNode(parent,cur);
            }else if(cur.key < key){
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
        return false;
    }

    private void removeNode(Node parent, Node cur) {
        if (cur.left == null){
            if (cur == root){
                root = cur.right;
            }else if(cur == parent.left){
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if (cur.right == null){
            if (cur == root){
                root = cur.left;
            }else if(cur == parent.left){
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            Node nextParent = cur;
            Node next = cur.right;
            while (next.left != null){
                nextParent = next;
                next = next.left;
            }
            cur.key = next.key;
            if (nextParent == cur){
                nextParent.right = next.right;
            }else {
                nextParent.left = next.right;
            }
        }
    }


}
