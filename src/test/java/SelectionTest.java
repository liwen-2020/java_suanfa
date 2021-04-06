import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SelectionTest {

    @Test
    public void selection_test() {
        int N = 10;
        Integer[] arr = new Integer[N];
        Random r = new Random();

        for (int i = 0; i < N; i++){
            arr[i] = r.nextInt();
        }

        Selection selection = new Selection(arr);
        selection.sort(arr);
        assertThat(selection.isSorted(arr),is(true));
        selection.show(arr);
    }

}
