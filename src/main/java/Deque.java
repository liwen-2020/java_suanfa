import java.util.Iterator;

public class Deque<Item> implements Iterable<Item>{
    private DoubleLinkedList linkedList;

    Deque(){
        linkedList = new DoubleLinkedList<Item>();
    }


    public boolean isEmpty(){
        return linkedList.linkedListNumber() == 0;
    }
    public int size() {return linkedList.size();
    }

    void pushLeft(Item item){
        linkedList.insertFrontBefore(new DoubleNode(item));
    }

    void pushRight(Item item){
        linkedList.insertLastAfter(new DoubleNode(item));
    }

    Item popLeft(){
        return (Item) linkedList.deleteFrontBefore().item();
    }

    Item popRight(){
        return (Item) linkedList.deleteLastAfter().item();
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
