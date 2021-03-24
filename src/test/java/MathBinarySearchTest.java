import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class MathBinarySearchTest {

    @Test
    public void binarySearchTest(){
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        MathBinarySearch mathBinarySearch = new MathBinarySearch(2,arr);
        assertThat(mathBinarySearch.binarySearch(),is(2));
    }
}
