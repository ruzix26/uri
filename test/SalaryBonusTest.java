import br.com.uri.beginner.SalaryBonus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/6/14.
 */
public class SalaryBonusTest {

    private SalaryBonus salaryBonus;

    @Before
    public void setUp() throws Exception {
        salaryBonus = new SalaryBonus();

    }

    @Test
    public void getSalary(){


        assertEquals("R$ 684.545", salaryBonus.getSalaryBonus(500, 1230.30));

    }
}
