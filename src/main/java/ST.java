/**
 *  插入      put
 *  查找      get
 *  删除      delete  没有返回值
 *  包含      contains
 *  是否为空   isEmpty
 *  大小      size
 *  键的集合   Iterable<Key> keys()
 *  不允许重复的键
 *  对应的健值，新的值覆盖旧的值
 *  键值不能为空
 *  值也不能为空
 */
public abstract class ST<Key extends Comparable<Key>,Value>{

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

    abstract Iterable<Key> keys();

    abstract  void traverse();

}
