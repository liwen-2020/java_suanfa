import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MergeBUTest {

    @Test
    public void MergeBU_test(){
        int N= 10000;
        Integer[] arr = new Integer[N];
        Random r =new Random();

        for(int i =0 ; i < N  ; i++){
            arr[i] = r.nextInt(N);
        }

        MergeBU mergeBU = new MergeBU();

        mergeBU.sort(arr);
        assertThat(mergeBU.isSorted(arr),is(true));
        mergeBU.show(arr);
    }
}
