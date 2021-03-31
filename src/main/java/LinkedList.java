public class LinkedList<Item> extends AbstractLinkedList<Item> {


    public void traverse(){
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

    public void insertFrontAfter(Node node){
        if(front() == null) {
            setFront(node);
            setLast(node);
        }else if (front() == last()) {
            setLast(node);
            front().setNext(node);
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
        }
        setLinkedListNumber(linkedListNumber()+1);
    }

    @Override
    public void insertLastBefore(Node node) {

    }


}
