import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>{

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    Bag(){

    }

    public void add(Item item){

    }

    public boolean isEmpty(){
        return false;
    }

    public int size(){
        return -1;
    }
}
