import org.junit.Test;

public class FixedCapacityStackOfStringsTest {

    @Test
    public void fixed_capacity_stack_string_test(){
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(10);
        String[] testStr = {
                "1","2","3","4","5","6","7","9","10"
        };

        for (String str:testStr) {
            s.push(str);
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("----------------------------------------------------------------");
        while (!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }
}
