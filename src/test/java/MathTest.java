import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class MathTest {
    @Test
    public void gcdTest(){
        int result = Math.gcd(1,0);
        assertThat(result,is(1));
    }

    @Test
    public void binarySearchTest(){
        int[] arr = {1,2,3,4,5};

        assertThat(Math.binarySearch(0,arr),is(-1));
        assertThat(Math.binarySearch(1,arr),is(0));
        assertThat(Math.binarySearch(2,arr),is(1));
        assertThat(Math.binarySearch(3,arr),is(2));
        assertThat(Math.binarySearch(4,arr),is(3));
    }

    @Test
    public void binarySearchTest_special(){
        int[] arr = new int[0];

        int result = Math.binarySearch(1,arr);
        assertThat(result,is(-1));
    }

    @Test
    public void rankTest(){
        int[] arr = {1,2,3,4,5};

        assertThat(Math.rank(0,arr),is(-1));
        assertThat(Math.rank(1,arr),is(0));
        assertThat(Math.rank(2,arr),is(1));
        assertThat(Math.rank(3,arr),is(2));
        assertThat(Math.rank(4,arr),is(3));
    }

}
