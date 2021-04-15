public class BST<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;
        private int N;

        public Node(Key key, Value value, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null)
            return 0;
        else
            return node.N;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node node, Key key) {
        if (node == null)
            return null;
        int cmp = key.compareTo(node.key);
        if (cmp > 0)
            return get(node.left, key);
        else if (cmp > 0)
            return get(node.right, key);
        else
            return node.value;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node node, Key key, Value value) {
        if (node == null)
            return new Node(key, value, 1);
        int cmp = key.compareTo(node.key);
        if (cmp < 0)
            node.left = put(node.left, key, value);
        else if (cmp > 0)
            node.right = put(node.right, key, value);
        else
            node.value = value;
        node.N = size(node.left) + size(node.right) +1;
        return node;
    }


    public void delete(Key key){
        root = delete(root,key);
    }

    private Node delete(Node node,Key key){
        if(node == null)
            return null;
        int cmp = key.compareTo(node.key);
        if(cmp < 0 )
            node.left = delete(node.left,key);
        else if(cmp >0)
            node.right = delete(node.right,key);
        else {
            if(node.right == null) return node.left;
            if(node.left == null) return node.right;
            Node tmp = node;
            node = min(node.right);
            node.right = deleteMin(tmp.right);
            node.left = tmp.left;
        }
        node.N = size(node.left) + size(node.right) + 1;
        return node;
    }

    private Node deleteMin(Node node) {
        if(node.left == null)
            return node.right;
        node.left = deleteMin(node.left);
        node.N = size(node.left) + size(node.right) + 1;
        return node;
    }

    private Node min(Node node) {
        if(node.left == null)
            return node;
        return min(node.left);
    }

}
