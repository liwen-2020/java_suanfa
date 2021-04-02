import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

    @Test
    public void create_link_test(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(0));
        assertTrue(linkedList.front() == null);
        assertTrue(linkedList.last() == null);
    }

    @Test
    public void link_after_front_add_test(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.traverse();

        Node one = new Node(1);
        linkedList.insertFrontAfter(one);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(1));
        assertThat(linkedList.front(),is(new Node(1)));
        assertThat(linkedList.last(),is(new Node(1)));

        Node two = new Node(2);
        linkedList.insertFrontAfter(two);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(2));
        assertThat(linkedList.front(),is(new Node(1,two)));
        assertThat(linkedList.last(),is(new Node(2)));

        Node three = new Node(3);
        linkedList.insertFrontAfter(three);
        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(3));
        assertThat(linkedList.front(),is(new Node(1,three)));
        assertThat(linkedList.last(),is(new Node(2)));

        Node four = new Node(4);
        linkedList.insertFrontAfter(four);
        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(4));
        assertThat(linkedList.front(),is(new Node(1,four)));
        assertThat(linkedList.last(),is(new Node(2)));
    }

    @Test
    public void link_after_last_add_test(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.traverse();

        Node one = new Node(1);
        linkedList.insertLastAfter(one);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(1));
        assertThat(linkedList.front(),is(new Node(1)));
        assertThat(linkedList.last(),is(new Node(1)));

        Node two = new Node(2);
        linkedList.insertLastAfter(two);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(2));
        assertThat(linkedList.front(),is(new Node(1,two)));
        assertThat(linkedList.last(),is(new Node(2)));

        Node three = new Node(3);
        linkedList.insertLastAfter(three);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(3));
        assertThat(linkedList.front(),is(new Node(1,two)));
        assertThat(linkedList.last(),is(new Node(3)));

        Node four = new Node(4);
        linkedList.insertLastAfter(four);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(4));
        assertThat(linkedList.front(),is(new Node(1,two)));
        assertThat(linkedList.last(),is(new Node(4)));
    }

    @Test
    public void link_before_front_add_test(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.traverse();

        Node one = new Node(1);
        linkedList.insertFrontBefore(one);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(1));
        assertThat(linkedList.front(),is(new Node(1)));
        assertThat(linkedList.last(),is(new Node(1)));

        Node two = new Node(2);
        linkedList.insertFrontBefore(two);

        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(2));
        assertThat(linkedList.front(),is(new Node(2,one)));
        assertThat(linkedList.last(),is(new Node(1)));

        Node three = new Node(3);
        linkedList.insertFrontBefore(three);
        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(3));
        assertThat(linkedList.front(),is(new Node(3,two)));
        assertThat(linkedList.last(),is(new Node(1)));

        Node four = new Node(4);
        linkedList.insertFrontBefore(four);
        linkedList.traverse();
        assertThat(linkedList.linkedListNumber(),is(4));
        assertThat(linkedList.front(),is(new Node(4,three)));
        assertThat(linkedList.last(),is(new Node(1)));
    }

    @Test
    public void link_front_delete_test(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.traverse();

        Node one = new Node(1);
        linkedList.insertFrontBefore(one);

        Node two = new Node(2);
        linkedList.insertFrontBefore(two);

        Node three = new Node(3);
        linkedList.insertFrontBefore(three);

        Node four = new Node(4);
        linkedList.insertFrontBefore(four);

        linkedList.traverse();

        Node result = linkedList.deleteFront();
        linkedList.traverse();

        assertThat(linkedList.linkedListNumber(),is(3));
        assertThat(linkedList.front(),is(new Node(3,two)));
        assertThat(linkedList.last(),is(new Node(1)));
        System.out.println(result.toString());
        assertThat(result,is(new Node(4)));

        result = linkedList.deleteFront();
        linkedList.traverse();

        assertThat(linkedList.linkedListNumber(),is(2));
        assertThat(linkedList.front(),is(new Node(2,one)));
        assertThat(linkedList.last(),is(new Node(1)));
        System.out.println(result.toString());
        assertThat(result,is(new Node(3)));

        result = linkedList.deleteFront();
        linkedList.traverse();

        assertThat(linkedList.linkedListNumber(),is(1));
        assertThat(linkedList.front(),is(new Node(1)));
        assertThat(linkedList.last(),is(new Node(1)));
        System.out.println(result.toString());
        assertThat(result,is(new Node(2)));

        result = linkedList.deleteFront();
        linkedList.traverse();

        assertThat(linkedList.linkedListNumber(),is(0));
        assertTrue(linkedList.front() == null);
        assertTrue(linkedList.last() == null);
        System.out.println(result.toString());
        assertThat(result,is(new Node(1)));

        result = linkedList.deleteFront();
        linkedList.traverse();

        assertThat(linkedList.linkedListNumber(),is(0));
        assertTrue(linkedList.front() == null);
        assertTrue(linkedList.last() == null);
        //System.out.println(result.toString());
        assertTrue(result == null);

        result = linkedList.deleteFront();
        linkedList.traverse();

        assertThat(linkedList.linkedListNumber(),is(0));
        assertTrue(linkedList.front() == null);
        assertTrue(linkedList.last() == null);
        //System.out.println(result.toString());
        assertTrue(result == null);
    }

}
