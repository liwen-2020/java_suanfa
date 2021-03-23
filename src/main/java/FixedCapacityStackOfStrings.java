/**
 * 一种表示定容字符串栈的抽象数据类型
 * FixedCapacityStackOfStrings(int cap)          创建一个容器为cap的空栈
 * void push(String item)                        添加一个字符串
 * String pop()                                  删除最近添加的字符串
 * boolean isEmpty()                             栈是否为空
 * int size()                                    栈中的字符串shuliang
 */
public class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;

    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }

    public boolean isEmpty(){
        return  N == 0;
    }

    public int size() {
        return  N;
    }

    public void push(String item){
        a[N++] = item;
    }

    public String pop(){
        return a[--N];
    }
}
