import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResizingArrayStackTest {
    @Test
    public void push_pop_resizingArrayStack(){
        ResizingArrayStack<Integer> s = new ResizingArrayStack<Integer>();
        s.push(1);
        s.push(2);
        assertThat(s.size(),is(2));
        assertThat(s.pop(),is(2));
        assertThat(s.pop(),is(1));
        assertThat(s.isEmpty(),is(true));
    }

    @Test
    public void iterator_push_pop_resizingArrayStack(){
        ResizingArrayStack<Integer> s = new ResizingArrayStack<>();

        for(int i = 0 ;i < 20 ; i ++){
            s.push(i);
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i : s){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
