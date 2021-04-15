public class RedBlackBST<Key extends Comparable<Key>,Value>{
    private Node root;
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node{
        Key key;
        Value value;
        Node left;
        Node right;
        int N;
        boolean color;

        public Node(Key key,Value value,int N,boolean color){
            this.key = key;
            this.value = value;
            this.N = N;
            this.color = color;
        }
    }

    private boolean isRed(Node node){
        if(node == null)
            return false;
        return node.color == RED;
    }

    Node rotateLeft(Node node){
        Node tmp =  node.right;
        node.right = tmp.left;
        tmp.left = node;
        tmp.color = node.color;
        node.color = RED;
        tmp.N = node.N;
        node.N = 1 + size(node.left) + size(node.right);

        return tmp;
    }

    Node rotateRight(Node node){
        Node tmp = node.left;
        node.left = tmp.right;
        tmp.right = node;
        tmp.color = node.color;
        node.color = RED;
        tmp.N = node.N;
        node.N = 1 + size(node.left) + size(node.right);

        return tmp;
    }

    private int size(Node node) {
        return node.N;
    }


}
