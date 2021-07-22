package hashtable1;
//import java.util.*;
import java.util.Arrays;

public class MyHashTable {
    private Node[] array;
    private int size;

    public MyHashTable() {
        array = new Node[3];
        size = 0;
    }

    @Override
    public String toString() {
        return "MyHashTable{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    public int hashFunction(int key){
        if (key < 0){
            throw new RuntimeException("key的范围是key>=0");
        }
        return key % array.length;
    }

    public void insert(int key){
        //1.找到下标
        int index = hashFunction(key);
        //2.判断是否存在（key不能重复）
        //3.插入到链表中
        if(!find(key)){
            Node node = new Node(key);
            node.next = array[index].next;
            array[index] = node;
            size++;
        }else {
            throw new RuntimeException("key不允许重复" + key);
        }

        //考虑负载因子
        if (1.0*size/array.length > 0.75){
            grow();
        }
    }

    private void grow() {
        Node[] newArray = new Node[array.length*2];
        for (int i = 0; i < array.length;i++){
            Node cur = array[i];
            while (cur != null){
                Node next = cur.next;
                int index = cur.key % newArray.length;
                cur.next = array[index];
                array[index] = cur;
                cur = next;
            }
        }
    }

    public boolean remove(int key){
        //1.找到下标
        int index = hashFunction(key);
        //2.在链表中找到对应结点删除
        if (array[index] == null){
            return false;
        }

        Node prev = null;
        for (Node cur = array[index];cur != null;cur = cur.next){
            if(cur.key == key){
                if(prev == null){
                    array[index] = array[index].next;
                    size--;
                    return true;
                }else {
                    prev.next = cur.next;
                    size--;
                    return true;
                }
            }
            prev = cur;
        }

        return false;
    }

    public boolean find(int key){
        int index = hashFunction(key);

        for(Node cur = array[index];cur != null;cur = cur.next){
            if(cur.key == key){
                return true;
            }
        }
        return false;
    }
}
