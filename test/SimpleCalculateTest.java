import br.com.uri.beginner.SimpleCalculate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/6/14.
 */
public class SimpleCalculateTest {

    private SimpleCalculate simpleCalculte;

    @Before
    public void setUp() throws Exception {
        simpleCalculte = new SimpleCalculate();

    }

    @Test
    public void simpleCalculate(){

        assertEquals("R$ 15.5", simpleCalculte.simpleCalculte(1, 5.30f, 2, 5.10f));

    }
}
