package 例题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public static void levelorder0(TreeNode root){
        if(root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> levelqueue = new LinkedList<>();
        queue.add(root);
        levelqueue.add(0);
        while(!queue.isEmpty()){
            TreeNode remove = queue.remove();
            int level = levelqueue.remove();
            System.out.println(level);
            System.out.println(remove.val);
            if(root.left != null){
                queue.add(root.left);
                levelqueue.add(level+1);

            }

            if(root.right != null){
                queue.add(root.right);
                levelqueue.add(level+1);
            }
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        int lastlevel = -1;

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> levelqueue = new LinkedList<>();

        queue.add(root);
        levelqueue.add(0);

        while(!queue.isEmpty()){

            TreeNode remove = queue.remove();
            int level = levelqueue.remove();
            if (level != lastlevel){
                list.add(new ArrayList<>());
            }
            lastlevel = level;
            List<Integer> rowlist = list.get(level);

            rowlist.add(remove.val);
            if(root.left != null){
                queue.add(root.left);
                levelqueue.add(level+1);

            }

            if(root.right != null){
                queue.add(root.right);
                levelqueue.add(level+1);

            }
        }
        return list;
    }
}
