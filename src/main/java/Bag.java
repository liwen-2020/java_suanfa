import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>{
    private LinkedList<Item> linkedList;

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    Bag(){
        linkedList = new LinkedList<Item>();
    }

    public void add(Item item){
        linkedList.insertFrontBefore(new Node<Item>(item));
    }

    public boolean isEmpty(){
        return linkedList.linkedListNumber() == 0;
    }

    public int size(){
        return linkedList.linkedListNumber();
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
