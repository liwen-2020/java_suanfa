import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class SequentialSearchST<Key extends Comparable<Key>,Value> extends ST<Key ,Value>  {
    private Node linkFirstNode ;
    private int N;

    @Override
    void put(Key key, Value val) {
        for(Node node = linkFirstNode ; node != null; node = node.next){
            if (key.equals(node.key)) {
                node.value = val;
                return;
            }
        }
        linkFirstNode = new Node(key,val,linkFirstNode);
    }

    @Override
    Value get(Key key) {
        for(Node node = linkFirstNode ; node != null; node = node.next){
            if (key.equals(node.key)) {
                return node.value;
            }
        }
       return null;
    }

    @Override
    int size() {
        return N;
    }

    @Override
    public void delete(Key key) {
        for(Node front = null , currenct = linkFirstNode  ; currenct != null;  front = currenct,currenct = currenct.next){
            if (key.equals(currenct.key)) {
                if(currenct == linkFirstNode){
                    linkFirstNode = linkFirstNode.next;
                    return;
                }else {
                    front.next = currenct.next;
                    currenct.next = null;
                }
              //  System.out.println(currenct);
            }
        }
    }

    @Override
    Iterable<Key> keys() {
        Queue<Key> q = new Queue<Key>();
        for(Node node = linkFirstNode ; node != null; node = node.next){
            q.enqueue(node.key);
        }

        return q;
    }

    @Override
    void traverse() {
        for(Node node = linkFirstNode  ; node != null;  node = node.next){
            System.out.println(node.toString());
        }
    }


    private class Node{
        Key key;
        Value value;
        Node next;

        public Node(Key key,Value value,Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return getClass().getName()
                    + "@"
                    + Integer.toHexString(hashCode())
                    + "@"
                    + key.toString()
                    + "@"
                    + value.toString()
                    + "@"
                    + ((next == null) ? "null" : (
                            next.getClass().getName()
                            + "@"
                            + Integer.toHexString(next.hashCode())));

        }
    }

}
