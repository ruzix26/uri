package br.com.uri.beginner.test;

import br.com.uri.beginner.Salary;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/6/14.
 */
public class EmployTest {

    private Salary salary;

    @Before
    public void setUp() throws Exception {
        salary = new Salary(25);

    }

    @Test
    public void numberOfEmploys(){

        assertEquals(25, salary.getNumberOfEmploys());
    }

    @Test
    public void calculateSalary(){

        assertEquals("U$ 550.0", salary.calculateSalary(100, 5.50f));
    }
}
