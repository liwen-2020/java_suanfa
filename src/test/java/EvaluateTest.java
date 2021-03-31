import org.junit.Test;

public class EvaluateTest {
    @Test
    public void  create_object(){
        String expression = "(1 + (2 + 3) * (4 * 5)))";

    //    Evaluate evaluate = new Evaluate(str);

        for(String str : expression.split(" ")){
            System.out.println(str);
        }
    }
}
