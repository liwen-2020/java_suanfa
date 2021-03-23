import java.util.Random;

import static java.lang.Math.min;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MergeBU {

    private static Comparable[] aux;

    public static void merge(Comparable[] a,int low,int mid,int high){
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

    public static void sort(Comparable[] a){
        int N = a.length;
        aux = new Comparable[N];
        for(int sz = 1;sz < N;sz = sz +sz){
            for(int low = 0;low < N-sz;low += sz+sz){
                merge(a,low,low+sz-1,min(low+sz+sz-1,N-1));
            }
        }
    }


    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0 ;
    }
    private static void exch(Comparable[] a ,int i ,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a){
        for(int i = 0 ;i < a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i = 1;i < a.length;i++){
            if(less(a[i],a[i-1]))
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        int N= 10000;
        Integer[] arr = new Integer[N];


        Random r =new Random();

        for(int i =0 ; i < N  ; i++){
            arr[i] = r.nextInt(N);
        }

        sort(arr);
        assertThat(isSorted(arr),is(true));
        show(arr);

    }
}
