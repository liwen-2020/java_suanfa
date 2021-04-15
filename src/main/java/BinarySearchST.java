public class BinarySearchST <Key extends Comparable<Key>,Value>{
    private Key[] keys;
    private Value[] values;
    private int N;

    public BinarySearchST(int Capacity){
        keys = (Key[]) new Comparable[Capacity];
        values = (Value[]) new Object[Capacity];
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return N ==0;
    }

    public Value get(Key key){
        if(isEmpty())
            return null;
        int i = rank(key);
        if(i < N && keys[i].compareTo(key) == 0)
            return values[i];
        else
            return null;
    }

    public int rank(Key key){
        int low = 0;
        int high = N-1;
        while(low <- high){
            int mid = (low + high)/2;
            int cmp = key.compareTo(keys[mid]);

            if(cmp <0 )
                high = mid -1;
            else if(cmp >0 )
                low = mid +1;
            else
                return mid;
        }
        return low;
    }

    public void put(Key key,Value value){
        int i = rank(key);
        if(i < N && keys[i].compareTo(key) == 0){
            values[i] = value;
            return;
        }

        for(int j = N; j > i; j--){
            keys[j] = keys[j-1];
            values[j] = values[j-1];
        }

        keys[i] = key;
        values[i] = value;
        N++;
    }

    public void delete(Key key){

    }

    public Key min(){
        return keys[0];
    }

    public Key max(){
        return keys[N-1];
    }

    public Key select(int k){
        return keys[k];
    }
}
