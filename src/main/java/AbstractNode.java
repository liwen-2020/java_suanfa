public abstract class AbstractNode<Item> {
    private Item item;
    private Node next;
    private String ptr = null;

    public AbstractNode() {
        this.item = null;
        this.next = null;
        this.ptr = super.toString();
    }

    public AbstractNode(Item item) {
        this.item = item;
        this.next = null;
        this.ptr = super.toString();
    }


    public Item item() {
        return item;
    }

    public Node next() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public String ptr() {
        return ptr;
    }

    public abstract  void addAfter(Node node) ;

    public abstract void addBefore(Node node) ;

    public abstract void delete() ;

}


