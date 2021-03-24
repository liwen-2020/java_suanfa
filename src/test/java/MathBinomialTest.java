import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class MathBinomialTest {

    @Test
    public void math_binomial_test(){
        //0.24609375  (10,5)
        //0.03125     (5,5)
        //0.0625      (4,4)
        //0.0795892373871788 (100,50)
        MathBinomial mathBinomial = new MathBinomial(100,50,0.5);
        System.out.println(mathBinomial.binomial());
    }

    //精度不够
    @Test
    public void math_binomial_true_test(){
        MathBinomial mathBinomial = new MathBinomial(100,100,0.5);
        assertThat(mathBinomial.isRight(),is(true));
    }

    @Test
    public void math_binomial_io_test(){
        MathBinomial mathBinomial = new MathBinomial(5,5,0.5);
        String path = "E:\\code\\java_suanfa\\src\\data\\binomial.txt";
        mathBinomial.WriteMapPath(path);
    }
}
