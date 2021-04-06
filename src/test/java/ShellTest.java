import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShellTest {
    @Test
    public void shell_test(){
        int N= 10000;
        Integer[] arr = new Integer[N];
        Random r =new Random();

        for(int i =0 ; i < N  ; i++){
            arr[i] = r.nextInt(N);
        }

        Shell shell = new Shell();

        shell.sort(arr);
        assertThat(shell.isSorted(arr),is(true));
        shell.show(arr);
    }
}
