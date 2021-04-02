import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertTrue;


public class StackTest {

    @Test
    public void create_stack_test(){
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        assertThat(stack.size(),is(5));

        Node result = stack.pop();
        assertThat(result.item(),is(5));
        assertThat(stack.size(),is(4));
        result = stack.pop();
        assertThat(result.item(),is(4));
        assertThat(stack.size(),is(3));
        result = stack.pop();
        assertThat(result.item(),is(3));
        assertThat(stack.size(),is(2));
        result = stack.pop();
        assertThat(result.item(),is(2));
        assertThat(stack.size(),is(1));
        result = stack.pop();
        assertThat(result.item(),is(1));
        assertThat(stack.size(),is(0));
        result = stack.pop();
        assertTrue(result == null);
        assertThat(stack.size(),is(0));
    }

    @Test
    public void stack_for_test(){
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        for(int i : stack){
            System.out.println(i);
        }
    }
}
