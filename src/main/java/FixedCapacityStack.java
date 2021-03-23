/**
 * 一种表示定容字符串栈的抽象数据类型
 * FixedCapacityStack(int cap)                   创建一个容器为cap的空栈
 * void push(String item)                        添加一个字符串
 * String pop()                                  删除最近添加的字符串
 * boolean isEmpty()                             栈是否为空
 * int size()                                    栈的大小
 */

public class FixedCapacityStack <Item>{
    private Item[] a;
    private int N ;
    public FixedCapacityStack(int cap){
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return  N;
    }

    public void push(Item item){
        a[N++] = item;
    }

    public Item pop(){
        return a[--N];
    }

}

