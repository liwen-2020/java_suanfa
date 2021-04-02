public class DoubleNode<Item> extends Node<Item>{
    private Node previous;

    public DoubleNode(){
        super();
        this.previous = null;
    }

    public DoubleNode(Item item){
        super(item);
        this.previous = null;
    }

    public DoubleNode(Node previous,Item item, Node next){
        super(item,next);
        this.previous = previous;
    }

    public DoubleNode(Item item, Node next){
        super(item,next);
        this.previous = null;
    }

    public DoubleNode(Node previous,Item item){
        super(item);
        this.previous = previous;
    }

    public Node Previous(){
        return previous;
    }
 
    public void setPrevious(Node node) {previous = node;}

    public void addAfter(Node node){
        setNext(node);

        DoubleNode tmp = (DoubleNode) node;
        tmp.setPrevious(this);
    }

    public void addBefore(Node node){
        node.setNext(this);
        this.previous = node;
    }

    public void deleteAfter(){
        DoubleNode tmp = (DoubleNode) next();
        tmp.setPrevious(null);
        setNext(null);
    }

    public void deleteBefore(){
        previous.setNext(null);
        previous = null;
    }

    @Override
    public String toString() {

        String strTmp = " ";
        String previousToString = "";
        String itemToString = " ";
        String nextToString = " ";

        if(previous == null){
            previousToString = "null";
        }else
            previousToString = previous.ptr();

        if(item() == null){
            itemToString = "null";
        }else
            itemToString = item().toString();

        if(next() == null){
            nextToString = "null";
        }else
            nextToString = next().ptr();
        strTmp = "{" + ptr()+ " ("+ previousToString + "," + itemToString + "," + nextToString + ")}";
        return strTmp;
    }

    @Override
    public boolean equals(Object other){
        if(this == other) return true;
        if(other == null) return false;
        if(this.getClass() != other.getClass())
            return false;
        DoubleNode that = (DoubleNode) other;
        if(this.previous != that.previous)
            return false;
        if(this.item() != that.item())
            return false;
        if(this.next() != that.next())
            return false;
        return true;
    }
}
