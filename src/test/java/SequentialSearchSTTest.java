
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertTrue;

public class SequentialSearchSTTest  {

    @Test
    public void create_object_test(){
        ST st = new SequentialSearchST<Integer,String>();

        assertThat(st.size(),is(0));
    }

    @Test
    public void put_get_test(){
        ST st = new SequentialSearchST<Integer,String>();
        st.put(1,"liwen");
        st.put(2,"ligang");
        st.put(3,"huqiang");

        assertThat(st.get(1),is("liwen"));
        assertThat(st.get(2),is("ligang"));

        st.traverse();
        System.out.println("-----------------------------------------");

        st.delete(2);

        System.out.println("-----------------------------------------");
        st.traverse();
    }

    @Test
    public void put_get_test2(){
        ST st = new SequentialSearchST<Integer,String>();
        st.put(1,"liwen");
        st.put(2,"ligang");
        st.put(3,"huqiang");

        assertThat(st.get(1),is("liwen"));
        assertThat(st.get(2),is("ligang"));

        st.traverse();
        System.out.println("-----------------------------------------");

        st.delete(3);

        System.out.println("-----------------------------------------");
        st.traverse();
    }


    @Test
    public void put_get_test3(){
        ST st = new SequentialSearchST<Integer,String>();
        st.put(1,"liwen");
        st.put(2,"ligang");
        st.put(3,"huqiang");

        assertThat(st.get(1),is("liwen"));
        assertThat(st.get(2),is("ligang"));

        st.traverse();
        System.out.println("-----------------------------------------");

        st.delete(1);

        System.out.println("-----------------------------------------");
        st.traverse();
    }


    @Test
    public void for_test(){
        ST st = new SequentialSearchST<Integer,String>();

        st.put(1,"liwen");
        st.put(2,"ligang");
        st.put(3,"huqiang");
        st.put(4,"weituo");

        for (Object key : st.keys()) {
            System.out.println(st.get((Integer) key));
        }

        st.delete(2);

    }

}