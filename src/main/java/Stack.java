import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{
    private LinkedList<Item> linkedList;

    Stack() {
        this.linkedList = new LinkedList<Item>();
    }

    public void push(Item item){
        linkedList.insertFrontBefore(new Node(item));
    }

    public Node pop(){
        return  linkedList.deleteFront();
    }

    public boolean isEmpty(){
        return linkedList.linkedListNumber() == 0;
    }

    public int size(){
        return  linkedList.linkedListNumber();
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
