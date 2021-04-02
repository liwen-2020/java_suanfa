import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>{
    private LinkedList<Item> linkedList;

    Queue(){
        linkedList = new LinkedList<Item>();
    }

    public void enqueue(Item item){
        linkedList.insertLastAfter(new Node<Item>(item));
    }

    public Node dequeue(){
        return  linkedList.deleteFront();
    }

    public boolean isEmpty(){
        return linkedList.linkedListNumber() == 0;
    }

    public int size(){
        return linkedList.linkedListNumber();
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node current = linkedList.front();
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = (Item) current.item();
            current = current.next();
            return item;
        }
    }
}
