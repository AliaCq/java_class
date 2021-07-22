package my_linked_list;

public class MyLinkedList {
    public Node head;
    public Node last;
    public int size;

    public MyLinkedList(){
        head = null;
        last= null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        Node cur = head;
        while (cur != null){
            if(cur.next != null){
                s.append(cur.val).append(",");
            }else {
                s.append(cur.val);
            }
            cur = cur.next;
        }

        s.append("]");
        return s.toString();
    }

    public boolean add(String e){
        Node node = new Node(e);
        //时间复杂度为O（1）
        if(head == null){
            head = node;
            last = node;
        }else{
            node.prev = last;
            last.next = node;
            last = node;
        }
        size++;
        //时间复杂度为O（n）
//        if(head == null){
//            head = node;
//        }else{
//            Node cur = head;
//            while (cur.next != null){
//                cur = cur.next;
//            }
//            cur.next = node;
//        }
        return true;
    }

    //时间复杂度为O（n）
    public void add(int index,String e){
        if(index < 0 || index > size()){
            throw new ArrayIndexOutOfBoundsException();
        }

        Node node = new Node(e);
        if(size() == 0){
            head = last = node;
        }else{
            if(index == 0){
                node.next = head;
                head.prev = node;
                head = node;
            }else if(index == size()){
                add(e);
                size--;
            }else{
                Node prev = head;
                for(int i = 0; i < index - 1;i++){
                    prev = prev.next;
                }

                Node next = prev.next;
                prev.next = node;
                next.prev = node;
                node.prev = prev;
                node.next = next;
            }
        }
        size++;
    }

    //时间复杂度为O（n）
    public String remove(int index){
        if(index < 0 || index >= size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        String e = null;
        if(size() == 1){
            e = head.val;
            head = last = null;
        }else if(index == 0){
            e = head.val;
            head = head.next;
            head.prev = null;
        }else if(index == size() - 1){
            e = last.val;
            last = last.prev;
            last.next = null;
        }else{
            Node toDelate = head;
            for(int i = 0; i < index;i++){
                toDelate = toDelate.next;
            }
            e = toDelate.val;
            Node prev = toDelate.prev;
            Node next = toDelate.next;

            prev.next = next;
            next.prev = prev;
        }
        size--;
        return e;
    }

    public boolean remove(String e){
        boolean flag = false;
        if(size() == 0){
            flag = false;
        }

        Node node = head;
        for(int i = 0; i < size();i++){
            if(node.val.equals(e)){
                if(i == 0){
                    //头删
                    head = head.next;
                    head.prev = null;
                }else if(i == size - 1){
                    //尾删
                    last = last.prev;
                    last.next = null;
                }else {
                    //中间删
                    Node prev = node.prev;
                    Node next = node.next;

                    prev.next = next;
                    next.prev = prev;
                }
                flag = true;
                size--;
            }
            node = node.next;
        }
        return flag;
    }

    public boolean contains(String e){
        for(Node cur = head;cur != null;cur = cur.next){
            if(cur.val.equals(e)){
                return true;
            }
        }
        return false;
    }

    public int indexOf(String e){
        int i = 0;
        for(Node cur = head;cur != null;cur = cur.next){
            if(cur.val.equals(e)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(String e){
        int i = size() - 1;
        for(Node cur = last;cur != null;cur = cur.prev){
            if(cur.val.equals(e)){
                return i;
            }
            i--;
        }
        return -1;
    }

    public String get(int index){
        if(index < 0 || index >= size()){
            throw new ArrayIndexOutOfBoundsException();
        }

        int i = 0;
        Node cur = head;
        for(i = 0; i < index;i++){
            cur = cur.next;
        }
        return cur.val;
    }

    public String set(int index,String e){
        if(index < 0 || index >= size()){
            throw new ArrayIndexOutOfBoundsException();
        }

        int i = 0;
        Node cur = head;
        for(i = 0; i < index;i++){
            cur = cur.next;
        }
        String old = cur.val;
        cur.val = e;
        return old;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void clear(){
        head = null;
        last = null;
        size = 0;
    }

    private int size() {
        //时间复杂度O(1)
        return size;
//        int count = 0;
//        Node cur = head;
//
//        while (cur != null){
//            count++;
//            cur = cur.next;
//        }
//        return count;
    }

    public MyIterator myIterator(){
        return new MyIterator(head);
    }

}
