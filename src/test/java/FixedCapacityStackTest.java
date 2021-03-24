import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FixedCapacityStackTest{

    @Test
    public void create_fixed_CapacityStack_test(){
        FixedCapacityStack<Integer> s = new FixedCapacityStack<Integer>(10);

        assertThat(s.size(),is(0));
        assertThat(s.isEmpty(),is(true));
    }

    @Test
    public void push_pop_fixed_CapacityStack_test(){
        FixedCapacityStack<Integer> s = new FixedCapacityStack<Integer>(10);

        s.push(1);
        s.push(2);

        assertThat(s.pop(),is(2));
        assertThat(s.pop(),is(1));

      //  assertThat(s.pop(),is(0));
    }

}
