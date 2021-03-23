import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Quick3way {
    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }
    private static void sort(Comparable[] a ,int low,int high) {
        if (high <= low)
            return;
        int lt = low;
        int i = low + 1;
        int gt = high;

        Comparable v = a[low];

        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) exch(a, lt++, i++);
            else if (cmp > 0) exch(a, i, gt--);
            else i++;
        }

        sort(a,low,lt-1);
        sort(a,gt+1,high);

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
