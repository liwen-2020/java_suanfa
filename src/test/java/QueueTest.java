import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class QueueTest {

    @Test
    public void create_queue_test(){
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);

        assertThat(queue.size(),is(8));

        Node result = queue.dequeue();
        assertThat(result.item(),is(1));
        assertThat(queue.size(),is(7));
        result = queue.dequeue();
        assertThat(result.item(),is(2));
        assertThat(queue.size(),is(6));
        result = queue.dequeue();
        assertThat(result.item(),is(3));
        assertThat(queue.size(),is(5));
        result = queue.dequeue();
        assertThat(result.item(),is(4));
        assertThat(queue.size(),is(4));
        result = queue.dequeue();
        assertThat(result.item(),is(5));
        assertThat(queue.size(),is(3));
        result = queue.dequeue();
        assertThat(result.item(),is(6));
        assertThat(queue.size(),is(2));
        result = queue.dequeue();
        assertThat(result.item(),is(7));
        assertThat(queue.size(),is(1));
        result = queue.dequeue();
        assertThat(result.item(),is(8));
        assertThat(queue.size(),is(0));
        result = queue.dequeue();
        assertTrue(result == null);
        assertThat(queue.size(),is(0));
    }

    @Test
    public void queue_for_test(){
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);

        for(int i : queue){
            System.out.println(i);
        }
    }

}
