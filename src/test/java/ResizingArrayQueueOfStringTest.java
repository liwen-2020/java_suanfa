import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertTrue;

public class ResizingArrayQueueOfStringTest {

    @Test
    public void create_object_test(){
        ResizingArrayQueueOfString queue = new ResizingArrayQueueOfString(5);

        assertThat(queue.isEmpty(),is(true));
        assertThat(queue.size(),is(0));
    }

    @Test
    public void queue_enqueue_test(){
        ResizingArrayQueueOfString queue = new ResizingArrayQueueOfString(2);
        queue.enqueue("1");

        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(1));

        queue.enqueue("2");

        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(2));

        queue.enqueue("3");
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(3));

        queue.enqueue("4");
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(4));


        queue.enqueue("5");
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(5));

        for(String str : queue){
            System.out.println(str);
        }
    }


    @Test
    public void queue_dequeue_test(){
        ResizingArrayQueueOfString queue = new ResizingArrayQueueOfString(2);
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");

        String result = queue.dequeue();
        assertThat(result,is("1"));
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(4));

        result = queue.dequeue();
        assertThat(result,is("2"));
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(3));

        result = queue.dequeue();
        assertThat(result,is("3"));
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(2));

        result = queue.dequeue();
        assertThat(result,is("4"));
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(1));

        result = queue.dequeue();
        assertThat(result,is("5"));
        assertThat(queue.isEmpty(),is(true));
        assertThat(queue.size(),is(0));

        result = queue.dequeue();
        assertTrue(result == null);
        assertThat(queue.isEmpty(),is(true));
        assertThat(queue.size(),is(0));

    }

    @Test
    public void queue_enqueue_beyond_test(){
        ResizingArrayQueueOfString queue = new ResizingArrayQueueOfString(2);
        queue.enqueue("1");
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(1));
        queue.enqueue("2");
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(2));
        queue.enqueue("3");
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(3));
        queue.enqueue("4");
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(4));
        queue.enqueue("5");
        assertThat(queue.isEmpty(),is(false));
        assertThat(queue.size(),is(5));

        for(String str : queue){
            System.out.println(str);
        }
    }

    @Test
    public void queue_dequeue_beyond_test(){
        ResizingArrayQueueOfString queue = new ResizingArrayQueueOfString(9);
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");
        queue.enqueue("6");
        queue.enqueue("7");
        queue.enqueue("8");
        queue.enqueue("9");


        for(String str : queue){
            System.out.println(str);
        }
        System.out.println("------------------------------------------");

        String result = " ";
        result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);
    }

    @Test
    public void queue_dequeue_enqueue_beyond_test(){
        ResizingArrayQueueOfString queue = new ResizingArrayQueueOfString(5);
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");

        queue.dequeue();
        queue.dequeue();


        queue.enqueue("6");
        for(String str : queue){
            System.out.println(str);
        }
        System.out.println("------------------------------------------");

    }
}
