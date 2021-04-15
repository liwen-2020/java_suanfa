public abstract class OrderST <Key extends Comparable<Key>,Value>{

    abstract void put(Key key,Value val);

    abstract Value get(Key key);

    boolean contains(Key key){
        return get(key) != null;
    }

    boolean isEmpty(){
        return size() == 0;
    }

    abstract int size();

    public abstract void delete(Key key);

    Iterable<Key> keys(){
        return keys(min(),max());
    }

    abstract Iterable<Key> keys(Key low,Key high);

    abstract Key min();

    abstract Key max();

    // 小于等于key的最大键
    abstract Key floor(Key key);

    // 大于等于key的最小键
    abstract Key ceiling(Key key);

    // 小于key的键的数量
    abstract int rank(Key key);

    //排名为k的键
    abstract Key select(int k);

    abstract void deleteMin();

    abstract void deleteMax();

    int size(Key low, Key high){
        if(high.compareTo(low) <0)
            return 0;
        else if(contains(high))
            return rank(high) - rank(low) + 1;
        else
            return rank(high) - rank(low);
    }
}
