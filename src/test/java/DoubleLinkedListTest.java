import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class DoubleLinkedListTest {

    @Test
    public void create_link_test(){
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<Integer>();

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(0));
        assertTrue(linkedList.front() == null);
        assertTrue(linkedList.last() == null);
    }

    @Test
    public void link_after_front_add_test(){
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<Integer>();
        linkedList.traverse();

        Node one = new DoubleNode(1);
        linkedList.insertFrontAfter(one);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(1));
        assertThat(linkedList.front(),is(new DoubleNode(1)));
        assertThat(linkedList.last(),is(new DoubleNode(1)));


        Node two = new DoubleNode(2);
        linkedList.insertFrontAfter(two);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(2));
        assertThat(linkedList.front(),is(new DoubleNode(1,two)));
        assertThat(linkedList.last(),is(new DoubleNode(one,2)));


        Node three = new DoubleNode(3);
        linkedList.insertFrontAfter(three);
        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(3));
        assertThat(linkedList.front(),is(new DoubleNode(1,three)));
        assertThat(linkedList.last(),is(new DoubleNode(three,2)));


        Node four = new DoubleNode(4);
        linkedList.insertFrontAfter(four);
        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(4));
        assertThat(linkedList.front(),is(new DoubleNode(1,four)));
        assertThat(linkedList.last(),is(new DoubleNode(three,2)));

    }

    @Test
    public void link_after_last_add_test(){
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<Integer>();
        linkedList.traverse();

        Node one = new DoubleNode(1);
        linkedList.insertLastAfter(one);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(1));
        assertThat(linkedList.front(),is(new DoubleNode(1)));
        assertThat(linkedList.last(),is(new DoubleNode(1)));

        Node two = new DoubleNode(2);
        linkedList.insertLastAfter(two);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(2));
        assertThat(linkedList.front(),is(new DoubleNode(1,two)));
        assertThat(linkedList.last(),is(new DoubleNode(one,2)));

        Node three = new DoubleNode(3);
        linkedList.insertLastAfter(three);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(3));
        assertThat(linkedList.front(),is(new DoubleNode(1,two)));
        assertThat(linkedList.last(),is(new DoubleNode(two,3)));

        Node four = new DoubleNode(4);
        linkedList.insertLastAfter(four);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(4));
        assertThat(linkedList.front(),is(new DoubleNode(1,two)));
        assertThat(linkedList.last(),is(new DoubleNode(three,4)));
    }

    @Test
    public void link_before_front_add_test(){
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<Integer>();
        linkedList.traverse();

        Node one = new DoubleNode(1);
        linkedList.insertFrontBefore(one);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(1));
        assertThat(linkedList.front(),is(new DoubleNode(1)));
        assertThat(linkedList.last(),is(new DoubleNode(1)));

        Node two = new DoubleNode(2);
        linkedList.insertFrontBefore(two);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(2));
        assertThat(linkedList.front(),is(new DoubleNode(2,one)));
        assertThat(linkedList.last(),is(new DoubleNode(two,1)));

        Node three = new DoubleNode(3);
        linkedList.insertFrontBefore(three);
        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(3));
        assertThat(linkedList.front(),is(new DoubleNode(3,two)));
        assertThat(linkedList.last(),is(new DoubleNode(two,1)));

        Node four = new DoubleNode(4);
        linkedList.insertFrontBefore(four);
        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(4));
        assertThat(linkedList.front(),is(new DoubleNode(4,three)));
        assertThat(linkedList.last(),is(new DoubleNode(two,1)));
    }

    @Test
    public void link_before_last_add_test(){
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<Integer>();
        linkedList.traverse();

        Node one = new DoubleNode(1);
        linkedList.insertLastBefore(one);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(1));
        assertThat(linkedList.front(),is(new DoubleNode(1)));
        assertThat(linkedList.last(),is(new DoubleNode(1)));

        Node two = new DoubleNode(2);
        linkedList.insertLastBefore(two);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(2));
        assertThat(linkedList.front(),is(new DoubleNode(2,one)));
        assertThat(linkedList.last(),is(new DoubleNode(two,1)));

        Node three = new DoubleNode(3);
        linkedList.insertLastBefore(three);
        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(3));
        assertThat(linkedList.front(),is(new DoubleNode(2,three)));
        assertThat(linkedList.last(),is(new DoubleNode(three,1)));

        Node four = new DoubleNode(4);
        linkedList.insertLastBefore(four);
        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(4));
        assertThat(linkedList.front(),is(new DoubleNode(2,three)));
        assertThat(linkedList.last(),is(new DoubleNode(four,1)));
    }
}
