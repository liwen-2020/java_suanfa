import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MergeTest {
    @Test
    public void merge_test(){
        int N= 10000;
        Integer[] arr = new Integer[N];
        Random r =new Random();

        for(int i =0 ; i < N  ; i++){
            arr[i] = r.nextInt(N);
        }
        Merge merge = new Merge(arr);

        merge.sort(arr);
        assertThat(merge.isSorted(arr),is(true));
        merge.show(arr);
    }
}
