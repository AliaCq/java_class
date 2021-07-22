package 力扣138;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class 力扣138Solution {
    static class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            return o1.hashCode() - o2.hashCode();
        }
    }
    public Node copyRandomList(Node head){
        Node newHead = new Node(-1);
        Node newLast = newHead;

        //复制链表
        for(Node cur = head; cur != null; cur = cur.next){
            Node node = new Node(cur.val);
            newHead.next = node;
            newLast = node;
        }

        //建立映射关系
        //TODO:解决Node不具备比较的问题
        Map<Node, Node> map = new TreeMap<>(new NodeComparator());
        Node oldCur = head;
        Node newCur = newHead.next;
        while(oldCur != null){
            map.put(oldCur,newCur);
            oldCur = oldCur.next;
            newCur = newCur.next;
        }

        //处理random
        oldCur = head;
        newCur = newHead.next;
        while(oldCur != null){
            Node oldRandom = oldCur.random;
            if(oldRandom == null){
                newCur.random = null;
            }else {
                Node newRanom = map.get(oldRandom);
                newCur.random = newRanom;
            }

            oldCur = oldCur.next;
            newCur = newCur.next;
        }

        return newHead.next;
    }
}
