
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class InsertionTest {

    @Test
    public void insert_test() {
        int N = 10000;
        Integer[] arr = new Integer[N];
        Random r = new Random();

        for (int i = 0; i < N; i++) {
            arr[i] = r.nextInt(N);
        }

        Insertion insertion = new Insertion();


        insertion.sort(arr);
        assertThat(insertion.isSorted(arr), is(true));
        insertion.show(arr);
    }
}
