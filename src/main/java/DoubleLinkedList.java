public class DoubleLinkedList<Item> extends AbstractLinkedList<Item> {

    public void traverse(){
        Node node = front();
        System.out.println("[N: " + linkedListNumber() +"]:");
        if( linkedListNumber() > 0 ) {
            for (int i = 1; i <= linkedListNumber(); i++) {
                System.out.println(((DoubleNode)node).toString());
                node = node.next();
            }
            System.out.println();
        }
    }

    public void insertFrontAfter(Node node){
        if(front() == null) {
            setFront(node);
            setLast(node);
        }else if (front() == last()) {
            setLast(node);
            front().setNext(node);
            ((DoubleNode)last()).setPrevious(front());
        }else {
            Node tmpNext = front().next();

            ((DoubleNode)node).setPrevious(front());
            node.setNext(tmpNext);

            front().setNext(node);
            ((DoubleNode)tmpNext).setPrevious(node);
        }
        setLinkedListNumber(linkedListNumber()+1);
    }

    public void insertFrontBefore(Node node){
        if(front() == null) {
            setFront(node);
            setLast(node);
        }else{
            Node tmp = front();
            setFront(node);
            front().setNext(tmp);

            ((DoubleNode)tmp).setPrevious(node);
        }
        setLinkedListNumber(linkedListNumber()+1);
    }



    public void insertLastBefore(Node node) {
        if(last() == null) {
            setFront(node);
            setLast(node);
        }else if (front() == last()){
            setFront(node);
            front().setNext(last());
            ((DoubleNode)last()).setPrevious(front());
        }else {
            Node tmpPrevious = ((DoubleNode) last()).Previous();
            ((DoubleNode)last()).setPrevious(node);
            tmpPrevious.setNext(node);

            node.setNext(last());
            ((DoubleNode)node).setPrevious(tmpPrevious);
        }
        setLinkedListNumber(linkedListNumber()+1);
    }

    public void insertLastAfter(Node node){
        if(last() == null) {
            setFront(node);
            setLast(node);
        }else {
            last().setNext(node);
            ((DoubleNode)node).setPrevious(last());
            setLast(node);
        }
        setLinkedListNumber(linkedListNumber()+1);
    }
}
