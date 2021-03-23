import org.junit.Test;

import java.util.Iterator;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResizingArrayStackTest {
    @Test
    public void create_ResizingArrayStack(){
        ResizingArrayStack<Integer> s = new ResizingArrayStack<>();

        assertThat(s.size(),is(0));
        assertThat(s.isEmpty(),is(true));
    }

    @Test
    public void push_pop_resizingArrayStack(){
        ResizingArrayStack<Integer> s = new ResizingArrayStack<>();

        s.push(1);
        s.push(2);

        assertThat(s.pop(),is(2));
        assertThat(s.pop(),is(1));
    }

    @Test
    public void beyond_push_pop_resizingArrayStack(){
        ResizingArrayStack<Integer> s = new ResizingArrayStack<>();

        for(int i = 0 ;i < 20 ; i ++){
            s.push(i);
            System.out.println(s.size());
        }

        for(int i = 0 ; i < 20;i ++){
            System.out.println(s.pop());
        }
    }

    @Test
    public void iterator_push_pop_resizingArrayStack(){
        ResizingArrayStack<Integer> s = new ResizingArrayStack<>();

        for(int i = 0 ;i < 20 ; i ++){
            s.push(i);
        }

        Iterator<Integer> iterator = s.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
