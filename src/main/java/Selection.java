import java.util.Random;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class Selection extends SortExample{
    private Comparable[] a = null;

    Selection(Comparable[] a) {
        this.a = a;
    }

    public void sort(Comparable[] a){
        int N = a.length;
        for(int i = 0 ;i < N ;i++){
            int min = i;
            for(int j = i + 1; j < N ;j++)
                if(less(a[j],a[min])) min = j;
            exch(a,i,min);
        }
    }
}
