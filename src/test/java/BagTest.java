import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class BagTest {

    @Test
    public void create_bag_test(){
        Bag<Integer> bag = new Bag<Integer>();

        bag.add(1);
        bag.add(2);
        bag.add(3);

        assertThat(bag.size(),is(3));
    }

    @Test
    public void bag_foreach_test(){
        Bag<Integer> bag = new Bag<Integer>();

        bag.add(1);
        bag.add(2);
        bag.add(3);

        for(int i : bag ){
            System.out.println(i);
        }
    }
}
