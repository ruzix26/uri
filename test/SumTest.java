
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gustavo on 7/3/14.
 */
public class SumTest {

    private Sum sum;

    @Before
    public void setUp(){
        sum = new Sum();
    }

    @Test
    public void testSum(){
        sum.sumNumbers(10, 9);

    }
}
