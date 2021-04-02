import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
public class DequeTest {

    @Test
    public void create_object_Test(){
        Deque<Integer> deque = new Deque<>();

        assertThat(deque.size(),is(0));
        assertThat(deque.isEmpty(),is(true));
    }

    @Test
    public void push_pop_test(){
        Deque<Integer> deque = new Deque<Integer>();

        deque.pushLeft(1);
        deque.pushLeft(2);

        deque.pushRight(3);
        deque.pushRight(4);

        assertThat(deque.size(),is(4));
        assertThat(deque.isEmpty(),is(false));

        for(int i : deque){
            System.out.println(i);
        }

        int result = deque.popLeft();
        assertThat(result,is(2));

        result = deque.popLeft();
        assertThat(result,is(1));

        result = deque.popRight();
        assertThat(result,is(4));

        result = deque.popRight();
        assertThat(result,is(3));
    }
}
