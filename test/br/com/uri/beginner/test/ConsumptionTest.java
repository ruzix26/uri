package br.com.uri.beginner.test;

import br.com.uri.beginner.Consumption;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gustavo on 7/7/14.
 */
public class ConsumptionTest {

    private Consumption consumption;

    @Before
    public void setUp() throws Exception {
        consumption = new Consumption();

    }

    @Test
    public void calculateConsumption(){

        assertEquals(14.285714285714286, consumption.calculateConsumption(500, 35), 0);
    }
}
