

public class Node<Item> extends AbstractNode<Item> {

    public Node(){
        super();
    }

    public Node(Item item){
        super(item);
    }

    public Node(Item item,Node node){
        super(item);
        setNext(node);
    }


    @Override
    public void addAfter(Node node){
        setNext(node);
    }
    @Override
    public void addBefore(Node node){
        node.setNext(this);
    }
    @Override
    public void delete(){
        setNext(null);
    }

    @Override
    public String toString() {

        String strTmp = " ";
        String itemToString = " ";
        String nextToString = " ";

        if(item() == null){
            itemToString = "null";
        }else
            itemToString = item().toString();

        if(next() == null){
            nextToString = "null";
        }else
            nextToString = next().ptr();
        strTmp = "{" + ptr()+ " ("+ itemToString + "," + nextToString + ")}";
        return strTmp;
    }


    @Override
    public boolean equals(Object other){
        if(this == other) return true;
        if(other == null) return false;
        if(this.getClass() != other.getClass())
            return false;
        Node that = (Node) other;
        if(this.item() != that.item())
            return false;
        if(this.next() != that.next())
            return false;
        return true;
    }
}
