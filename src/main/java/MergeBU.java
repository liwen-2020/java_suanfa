import java.util.Random;

import static java.lang.Math.min;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MergeBU extends SortExample{

    private Comparable[] aux;

    public void merge(Comparable[] a,int low,int mid,int high){
        int i = low;
        int j = mid + 1;

        for(int k = low; k <= high;k++){
            aux[k] = a[k];
        }

        for(int k = low; k <= high; k++){
            if(i > mid)                  a[k] = aux[j++];
            else if(j > high)            a[k] = aux[i++];
            else if(less(aux[j],aux[i])) a[k] = aux[j++];
            else                         a[k] = aux[i++];
        }
    }

    public void sort(Comparable[] a){
        int N = a.length;
        aux = new Comparable[N];
        for(int sz = 1;sz < N;sz = sz +sz){
            for(int low = 0;low < N-sz;low += sz+sz){
                merge(a,low,low+sz-1,min(low+sz+sz-1,N-1));
            }
        }
    }
}
