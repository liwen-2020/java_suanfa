public class RingLinkList<Item> extends AbstractLinkedList<Item> {

    public void traverse() {
        Node node = front();
        System.out.println("[N: " + linkedListNumber() +"]:");
        if( linkedListNumber() > 0 ) {
            for (int i = 1; i <= linkedListNumber(); i++) {
                System.out.println(node.toString());
                node = node.next();
            }
            System.out.println();
        }
    }

    public void insertFrontAfter(Node node) {
        if(front() == null) {
            setFront(node);
            setLast(node);
        }else if (front() == last()) {
            setLast(node);
            front().setNext(node);
            node.setNext(front());
        }else {
            Node tmp = front().next();
            front().setNext(node);
            node.setNext(tmp);
        }
        setLinkedListNumber(linkedListNumber()+1);
    }

    public void insertFrontBefore(Node node){
        if(front() == null) {
            setFront(node);
            setLast(node);
        }else {
            Node tmp = front();
            setFront(node);
            front().setNext(tmp);
            last().setNext(front());
        }
        setLinkedListNumber(linkedListNumber()+1);
    }

    public void insertLastAfter(Node node){
        if(last() == null) {
            setFront(node);
            setLast(node);
        }else {
            last().setNext(node);
            setLast(node);
            node.setNext(front());
        }
        setLinkedListNumber(linkedListNumber()+1);
    }

    @Override
    public void insertLastBefore(Node node) {

    }

    public Node deleteFront() {
        Node tmp = front();
        if(linkedListNumber() == 0){
            return null;
        }

        if(linkedListNumber() == 1){
            setFront(null);
            setLast(null);
            setLinkedListNumber(linkedListNumber()-1);
            return tmp;
        }
        if (linkedListNumber() == 2){
            setFront(front().next());
            last().setNext(front());
            front().setNext(null);
            tmp.setNext(null);
            setLinkedListNumber(linkedListNumber()-1);
            return tmp;
        }
        setFront(front().next());
        last().setNext(front());
        tmp.setNext(null);

        setLinkedListNumber(linkedListNumber()-1);
        return tmp;
    }

    public Node deleteLast() {
        return  deleteFront();
    }
}
