import java.util.*
;
public class LRUCache {

    private class Node{

        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key , int val){
            this.key = key;
            this.val = val;
        }
    }

    private final int capacity;
    private final Map<Integer , Node > map ;
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity){

        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0 , 0);
        this.tail = new Node(0 , 0);
        this.head.next = tail;
        this.tail.prev = head;
    }

    public void put(int key , int val){

        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = val;
            remove(node);
            inserAtHead(node);
        }
        else {

            if(map.size() == capacity){

                map.remove(tail.prev.key);
                remove(tail.prev);
            }

            Node newNode = new Node(key, val);
            map.put(key, newNode);
            inserAtHead(newNode);
        }
    }

    public int get(int key){

        if(!map.containsKey(key)){
            return -1;
        }

        Node node = map.get(key);
        remove(node);
        inserAtHead(node);
        return node.val;
    }

    private void remove(Node node){

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void inserAtHead(Node node){

        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    
}
