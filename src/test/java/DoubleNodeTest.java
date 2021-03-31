import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;

public class DoubleNodeTest {

    @Test
    public void create_doubleNode_test(){
        Node<Integer> node = new DoubleNode<Integer>();
        Node<Integer> one = new DoubleNode<Integer>(1);

        System.out.println(node.toString());
        System.out.println(one.toString());

        assertThat(node,is(new DoubleNode<Integer>()));
        assertThat(one,is(new DoubleNode<Integer>(1)));
    }

    @Test
    public void node_add_after_delete_after_test(){
        DoubleNode<Integer> one = new DoubleNode<Integer>(1);
        DoubleNode<Integer> two = new DoubleNode<Integer>(2);

        one.addAfter(two);
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new DoubleNode<Integer>(1,two)));
        assertThat(two,is(new DoubleNode<Integer>(one,2)));


        one.deleteAfter();
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new DoubleNode<Integer>(1)));
        assertThat(two,is(new DoubleNode<Integer>(2)));
    }

    @Test
    public void node_add_after_delete_before_test(){
        DoubleNode<Integer> one = new DoubleNode<Integer>(1);
        DoubleNode<Integer> two = new DoubleNode<Integer>(2);

        one.addAfter(two);
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new DoubleNode<Integer>(1,two)));
        assertThat(two,is(new DoubleNode<Integer>(one,2)));

        two.deleteBefore();
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new DoubleNode<Integer>(1)));
        assertThat(two,is(new DoubleNode<Integer>(2)));
    }

    @Test
    public void node_add_before_delete_after_test(){
        DoubleNode<Integer> one = new DoubleNode<Integer>(1);
        DoubleNode<Integer> two = new DoubleNode<Integer>(2);

        two.addBefore(one);
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new DoubleNode<Integer>(1,two)));
        assertThat(two,is(new DoubleNode<Integer>(one,2)));

        one.deleteAfter();
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new DoubleNode<Integer>(1)));
        assertThat(two,is(new DoubleNode<Integer>(2)));
    }

    @Test
    public void node_add_before_delete_before_test(){
        DoubleNode<Integer> one = new DoubleNode<Integer>(1);
        DoubleNode<Integer> two = new DoubleNode<Integer>(2);

        two.addBefore(one);
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new DoubleNode<Integer>(1,two)));
        assertThat(two,is(new DoubleNode<Integer>(one,2)));

        two.deleteBefore();
        System.out.println(one.toString());
        System.out.println(two.toString());
        assertThat(one,is(new DoubleNode<Integer>(1)));
        assertThat(two,is(new DoubleNode<Integer>(2)));
    }

    @Test
    public void node_equals_test(){
        DoubleNode<Integer> nullNode = new DoubleNode<Integer>(null);
        DoubleNode<Integer> one = new DoubleNode<Integer>(1);
        DoubleNode<Integer> two = new DoubleNode<Integer>(2);

        assertThat(nullNode,is(new DoubleNode(null)));
        assertThat(one,is(new DoubleNode(1)));

        assertFalse(one == two);
    }
}
