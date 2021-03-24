import org.junit.Test;

public class FixedCapacityStackOfStringsTest {

    @Test
    public void fixed_capacity_stack_string_test(){
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(10);
        String[] testStr = {
                "to","be","or","not","to","be"," ","that","is"
        };

        for (String str:testStr) {
            System.out.println(str);
            s.push(str);
        }

        while (!s.isEmpty()){
            System.out.println(s.pop());
        }

        System.out.println(s.size());
    }
}
