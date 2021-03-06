public class MaxPQ<T extends Comparable<T>> {

    private T[] pq ;
    private int N = 0;

    public MaxPQ(int maxN){
        pq = (T[]) new Comparable[maxN+1];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size() {
        return  N;
    }

    public void insert(T v) {
        pq[++N] = v;
        swim(N);
    }

    public T delMax(){
        T max = pq[1];
        exch(1,N--);
        pq[N+1] = null;
        sink(1);
        return max;
    }

    private boolean less(int i,int j ){
        return pq[i].compareTo(pq[j]) <0 ;
    }

    private void exch(int i,int j){
        T t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    private void swim(int k){
        while(k >1 && less(k/2,k)) {
            exch(k/2,k);
            k= k/2;
        }
    }

    private void sink(int k){
        while (2*k <=N){
            int j = 2*k;
            if(j <N && less(j,j+1)) j++;
            if(!less(k,j)) break;
            exch(k,j);
            k = j;
        }
    }

    public static void main(String[] args){
        MaxPQ<Integer> maxPQ = new MaxPQ<Integer>(5);

        maxPQ.insert(1);
        maxPQ.insert(2);
        maxPQ.insert(3);
        maxPQ.insert(4);
        maxPQ.insert(5);

        System.out.println(maxPQ.delMax());
        System.out.println(maxPQ.delMax());
        System.out.println(maxPQ.delMax());
        System.out.println(maxPQ.delMax());
        System.out.println(maxPQ.delMax());
    }
}
