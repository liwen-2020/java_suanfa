public abstract class AbstractLinkedList<Item>{
        private Node front = null;
        private Node last  = null;
        private int linkedListNumber = 0;

        public Node front(){
            return front;
        }
        public void setFront(Node front) {this.front = front;}

        public Node last(){
            return last;
        }
        public void setLast(Node last) {this.last = last;}
        public int linkedListNumber(){
            return linkedListNumber;
        }
        public void setLinkedListNumber(int Number) {linkedListNumber = Number;}

        public abstract void traverse();

        public abstract void insertFrontAfter(Node node);
        public abstract void insertFrontBefore(Node node);
        public abstract void insertLastAfter(Node node);
        public abstract void insertLastBefore(Node node);

}
