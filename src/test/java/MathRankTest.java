import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class MathRankTest {

    @Test
    public void rankTest(){
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        MathRank mathRank = new MathRank(4,arr);
        assertThat(mathRank.rank(),is(4));
    }

}
