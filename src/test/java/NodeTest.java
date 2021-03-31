import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertFalse;

public class NodeTest {

    @Test
    public void create_node_test() {
        Node<Integer> node = new Node<Integer>();
        Node<Integer> one = new Node<Integer>(1);

        System.out.println(node.toString());
        System.out.println(one.toString());

        assertThat(node, is(new Node<Integer>()));
        assertThat(one, is(new Node<Integer>(1)));
    }

    @Test
    public void node_add_delete_after_test(){
        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);

        one.addAfter(two);
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new Node<Integer>(1,two)));
        assertThat(two,is(new Node<Integer>(2)));

        one.delete();
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new Node<Integer>(1)));
        assertThat(two,is(new Node<Integer>(2)));
    }

    @Test
    public void node_add_delete_before_test(){
        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);

        two.addBefore(one);
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new Node<Integer>(1,two)));
        assertThat(two,is(new Node<Integer>(2)));

        one.delete();
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new Node<Integer>(1)));
        assertThat(two,is(new Node<Integer>(2)));
    }

    @Test
    public void node_equals_test(){
        Node<Integer> nullNode = new Node<Integer>(null);
        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);

        assertThat(nullNode,is(new Node(null)));
        assertThat(one,is(new Node(1)));
        assertFalse(one == two);
    }
}
