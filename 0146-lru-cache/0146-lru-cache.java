class LRUCache {
    Node head=new Node();
    Node tail=new Node();
    Map<Integer,Node> map;
    int cap;
    public LRUCache(int capacity) {
        map=new HashMap<>();
        this.cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        Node node=map.get(key);
        if(node==null)
            return -1;
        remove(node);
        add(node);
        return node.data;
    }
    
    public void put(int key, int value) {
        Node node=map.get(key);
        if(node!=null)
        {
            node.data=value;
            remove(node);
            add(node);
        }
        else 
        {
            if(cap==map.size())
            {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            node=new Node();
            node.data=value;
            node.key=key;
            add(node);
            map.put(key,node);
        }
    }
    public void add(Node node)
    {
        Node headNext=head.next;
        head.next=node;
        node.prev=head;
        node.next=headNext;
        headNext.prev=node;
    }
    public void remove(Node node)
    {
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
class Node
{
    int data,key;
    Node prev,next;
    
}