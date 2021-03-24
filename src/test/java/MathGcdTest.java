import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class MathGcdTest {
    @Test
    public void gcdTest(){
        MathGcd mathGcd = new MathGcd(165,31);
        int result = mathGcd.gcd();
        assertThat(result,is(1));
    }
}
