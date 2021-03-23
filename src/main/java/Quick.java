import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Quick {

    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a,int low,int high){
        if(high <= low)
            return;
        int j = partition(a,low,high);
        sort(a,low,j-1);
        sort(a,j+1,high);
    }

    private static int partition(Comparable[] a,int low,int high) {
        int i = low;
        int j = high + 1;
        Comparable v = a[low];

        while (true) {
            while (less(a[++i], v))
                if (i == high) break;
            while (less(v, a[--j]))
                if (j == low) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, low, j);
        return j;
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
