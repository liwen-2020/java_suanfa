import org.glassfish.hk2.utilities.ImmediateErrorHandler;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Merge extends SortExample{
    private Comparable[] aux;

    public Merge(Comparable[] a){
        aux = new Comparable[a.length];
    }
    public void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }

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

    private void sort(Comparable[] a,int low,int high){
        if(high <= low) return;
        int mid = (low + high)/2;

        sort(a,low,mid);
        sort(a,mid+1,high);

        merge(a,low,mid,high);
    }
}
